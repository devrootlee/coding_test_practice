package programmers.coding.codingLevel1;
/**
 * TITLE : 약수의 합
 * LEVEL : 1
 */
public class sum_of_divisors {
    public static int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(12);
        solution(5);
    }
}
