package codingtest.programmers.coding.codingLevel1;
/**
 * TITLE : 소수 찾기
 * LEVEL : 1
 */
public class find_prime_numbers {

    public static int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    System.out.println(i);
                    break;
                }
            }
            if (isPrime) {
                answer++;
            }
        }

//        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution(10);
//        solution(5);
    }
}
