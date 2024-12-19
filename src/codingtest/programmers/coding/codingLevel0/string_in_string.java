package codingtest.programmers.coding.codingLevel0;
/**
 * TITLE : 문자열안에 문자열
 * LEVEL : 0
 */
public class string_in_string {

    public static int solution(String str1, String str2){
        int answer = 0;

        if(str1.contains(str2)){
            answer = 1;
        }
        else{
            answer = 2;
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution("ab6CDE443fgh22iJKlmn1o","6CD");
        solution("ppprrrogrammers","pppp");
        solution("AbcAbcA","AAA");

    }
}
