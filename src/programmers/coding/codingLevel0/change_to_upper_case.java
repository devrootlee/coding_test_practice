package programmers.coding.codingLevel0;
/**
 * TITLE : 대문자로 바꾸기
 * LEVEL : 0
 */
public class change_to_upper_case {

    public static String solution(String myString){
        String answer = myString;

        answer = answer.toUpperCase();

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution("aBcDeFg");
        solution("AAA");
    }
}
