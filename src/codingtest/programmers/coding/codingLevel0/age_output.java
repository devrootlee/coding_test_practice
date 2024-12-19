package codingtest.programmers.coding.codingLevel0;

/**
 * TITLE : 나이 출력
 * LEVEL : 0
 */
public class age_output {
    public static int solution(int age) {
        int answer = 0;
        boolean cond = (age > 0) & (age <= 120);

        if (cond == true) {
            answer = 2022 - age + 1;
        } else {
            answer = -1;
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {

        solution(40);
        solution(23);

    }
}
