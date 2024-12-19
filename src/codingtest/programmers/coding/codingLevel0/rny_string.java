package codingtest.programmers.coding.codingLevel0;
/**
 * TITLE : rny_string
 * LEVEL : 0
 */
public class rny_string {

    public static String solution(String rny_string){
        String answer = "";

        answer = rny_string.replaceAll("m","rn");
/**/
        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution("masterpiece");
        solution("programmers");
        solution("jerry");
        solution("burn");
    }
}
