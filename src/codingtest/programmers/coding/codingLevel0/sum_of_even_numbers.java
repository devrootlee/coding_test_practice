package codingtest.programmers.coding.codingLevel0;

/**
 * TITLE : 짝수의 합
 * LEVEL : 0
 */
public class sum_of_even_numbers {
    public static int solution(int n) {
        int answer = 0;
        boolean cond = (n > 0) & (n <= 1000);

        if (cond == true) {

            for (int i = 0; i <= n; i++) {
                if (i % 2 == 0) {
                    answer += i;
                }
            }

        } else {
            answer = -1;
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(10);
        solution(4);
    }
}
