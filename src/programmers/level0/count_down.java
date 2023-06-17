package programmers.level0;

/**
 * TITLE : 카운트 다운
 * LEVEL : 0
 */
public class count_down {

    public static int[] solution(int start, int end) {
        int[] answer = new int[start - end + 1];

        for(int i = 0; i < answer.length; i++) {
            answer[i] = start - i;

            System.out.println(answer[i]);
        }


        return answer;
    }

    public static void main(String[] args) {
        solution(10,3);
    }
}
