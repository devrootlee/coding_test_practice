package codingtest.programmers.coding.codingLevel0;
/**
 * TITLE : 피자 나눠 먹기(2)
 * LEVEL : 0
 */
public class share_a_pizza_2 {

    public static int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= 6 * n; i++) {
            if (6 * i % n == 0) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {

        solution(6);
        solution(10);
        solution(4);
    }
}
