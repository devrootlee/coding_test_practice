package codingtest.programmers.coding.codingLevel2;


import java.util.*;

/**
 * TITLE : 기능 개발
 * LEVEL : 2
 */
public class function_development {

    public static int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            int pr = progresses[i];
            int j = 0;

            for (; ; ) {
                pr = pr + speeds[i];
                j++;

                if (pr >= 100) {
                    break;
                }
            }
            queue.add(j);
        }
        System.out.println(queue);

        List<Integer> list = new ArrayList<>();

        while (!queue.isEmpty()) {

            if(list.size()==0){
                list.add(queue.poll());
            }else {
                int poll = queue.poll();
                int i = list.size();

                if(list.get(list.size()-i) >= poll){
                    list.add(poll);
                }else {
                    answer.add(list.size());
                    list.clear();
                    list.add(poll);
                }
            }
        }
        answer.add(list.size());

        System.out.println(answer);



        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] progress1 = {93, 30, 30, 55, 55};
        int[] speeds1 = {1, 30, 30, 5, 5};
        int[] progress2 = {90, 90, 90};
        int[] speeds2 = {1,5,4};

        solution(progress1, speeds1);
//        solution(progress2, speeds2);
    }
}
