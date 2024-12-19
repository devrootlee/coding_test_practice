package codingtest.programmers.coding.codingLevel0;
/**
 * TITLE : 카운트 업
 * LEVEL : 0
 */
public class count_up {
    public static int[] solution(int start, int end){
        int[] answer = new int[end - start + 1];

        for (int i = 0; i < answer.length; i++){

            answer[i] = start + i;

            System.out.println(answer[i]);
        }


        return answer;
    }

    public static void main(String[] args) {
        solution(3,10);
    }
}
