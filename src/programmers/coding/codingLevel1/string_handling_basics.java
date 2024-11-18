package programmers.coding.codingLevel1;
/**
 * TITLE : 문자열 다루기 기본
 * LEVEL : 1
 */
public class string_handling_basics {

    public static boolean solution(String s) {
        boolean answer = true;

        if (s.length() != 4 && s.length() != 6) {
            answer = false;
        }

        String t = s.replaceAll("[\\D]", "");

        if(!s.equals(t)){
            answer =false;
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution("1234");
        solution("1234A");
        solution("12A457");
    }
}
