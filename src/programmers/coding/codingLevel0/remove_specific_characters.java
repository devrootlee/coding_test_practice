package programmers.coding.codingLevel0;
/**
 * TITLE : 특정 문자 제거하기
 * LEVEL : 0
 */
public class remove_specific_characters {

    public static String solution(String my_string, String letter) {
        String answer = my_string;

        answer = answer.replaceAll(letter,"");

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution("abcdef","f");
        solution("BCBdbe","B");
    }
}
