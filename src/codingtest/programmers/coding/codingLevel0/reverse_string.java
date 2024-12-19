package codingtest.programmers.coding.codingLevel0;
/**
 * TITLE : 문자열 뒤집기
 * LEVEL : 0
 */
public class reverse_string {

    public static String solution(String my_string){
        StringBuffer sb = new StringBuffer(my_string);
        String answer = sb.reverse().toString();

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution("jaron");
        solution("bread");
    }
}
