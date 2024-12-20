package codingtest.programmers.coding.codingLevel1;
/**
 * TITLE : 정수 제곱근 판별
 * LEVEL : 1
 */
public class determine_integer_square_root {

    public static long solution(long n) {
        long answer = 0;

        long sqrt = (long) Math.sqrt(n); // 정수 제곱근 계산

        // 제곱근의 제곱이 n과 같은지 확인
        if (sqrt * sqrt == n) {
            answer = (sqrt + 1) * (sqrt + 1); // 정수 제곱근인 경우
        } else {
            answer = -1; // 정수 제곱근이 아닌 경우
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution(121);
        solution(1);
        solution(4);
    }
}
