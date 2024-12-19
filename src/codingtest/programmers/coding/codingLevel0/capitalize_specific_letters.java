package codingtest.programmers.coding.codingLevel0;
/**
 * TITLE : 특정한 문자를 대문자로 바꾸기
 * LEVEL : 0
 */
public class capitalize_specific_letters {

    public static String solution(String my_string, String alp){
        String answer = "";

        answer = my_string.replace(alp,alp.toUpperCase());


        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {

        solution("programmers","p");
        solution("lowercase","x");
    }
}
