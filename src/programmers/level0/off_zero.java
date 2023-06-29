package programmers.level0;
/**
 * TITLE : 0 떼기
 * LEVEL : 0
 */
public class off_zero {

    public static String solution(String n_str) {
        String answer = "";

        answer = String.valueOf(Integer.parseInt(n_str));

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution("0010");
        solution("854020");
    }
}
