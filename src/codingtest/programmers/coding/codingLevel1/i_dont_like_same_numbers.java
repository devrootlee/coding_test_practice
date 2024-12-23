package codingtest.programmers.coding.codingLevel1;

import java.util.*;

/**
 * TITLE : 같은 숫자는 싫어
 * LEVEL : 1
 */
public class i_dont_like_same_numbers {

    public static int[] solution(int []arr) {
        int[] answer = {};
        Queue<Integer> queue = new ArrayDeque();
        
        //queue 에 배열 값 넣기
        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
        }

        //첫번째 값 리스트에 넣기
        List<Integer> answerlist = new ArrayList<>();
        answerlist.add(queue.poll());
        
        //list의 제일 마지막 값과 poll이 다르면 값 넣기
        int listIdx = 0;
        while (queue.size() != 0) {
            int poll = queue.poll();
            if(answerlist.get(listIdx) != poll) {
                answerlist.add(poll);
                listIdx++;
            }
        }

        //list to array
        answer = new int[answerlist.size()];
        for (int i = 0; i < answerlist.size(); i++) {
            answer[i] = answerlist.get(i);
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{1,1,3,3,0,1,1});
        solution(new int[]{4,4,4,3,3});
        solution(new int[]{1,2,3,4,5});
    }
}
