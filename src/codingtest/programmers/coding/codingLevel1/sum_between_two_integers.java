package codingtest.programmers.coding.codingLevel1;
/**
 * TITLE : 두 정수 사이의 합
 * LEVEL : 1
 */
public class sum_between_two_integers {

    public static long solution(int a, int b) {
        long answer = 0;

        boolean c = a > b;

        if (c == true) {

            for (int i = b; i <= a; i++) {
                answer += i;
            }
        } else {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(3,5);
        solution(3,3);
        solution(5,3);
    }
}
