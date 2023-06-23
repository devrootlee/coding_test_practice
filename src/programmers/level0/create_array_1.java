package programmers.level0;

/**
 * TITLE : 배열 만들기 1
 * LEVEL : 0
 */
public class create_array_1 {

    public static int[] solution(int n, int k) {
        int[] answer = new int[n / k];

        for (int i = 1; i <= answer.length; i++) {
            answer[i - 1] = k * i;
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(10, 3);
        solution(15, 5);
    }
}
