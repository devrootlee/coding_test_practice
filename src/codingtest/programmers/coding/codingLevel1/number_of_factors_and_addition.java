package codingtest.programmers.coding.codingLevel1;
/**
 * TITLE : 약수의 개수와 덧셈
 * LEVEL : 1
 */
public class number_of_factors_and_addition {
    public static int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            int cnt = 0;
            for  (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            if (cnt % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(13,17);
        solution(24,27);
    }
}
