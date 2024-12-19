package codingtest.programmers.coding.codingLevel0;
/**
 * TITLE : 소문자로 변경하기
 * LEVEL : 0
 */
public class change_to_lower_case {

    public static String solution(String myString){
        String answer = "";

        answer = myString.toLowerCase();

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution("aBcDeFg");
        solution("aaa");
    }
}
