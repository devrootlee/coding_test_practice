package programmers.coding.codingLevel0;

/**
 * TITLE : 공배수
 * LEVEL : 0
 */
public class common_multiple {

    public static int solution(int number, int n, int m) {
        int answer = 0;

        if (number % n == 0 && number % m == 0) {
            answer = 1;
        } else {
            answer = 0;
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {

        solution(60, 2, 3);
        solution(55, 10, 5);
    }
}
