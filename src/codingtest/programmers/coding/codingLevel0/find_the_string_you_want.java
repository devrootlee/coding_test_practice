package codingtest.programmers.coding.codingLevel0;
/**
 * TITLE : 원하는 문자열 찾기
 * LEVEL : 0
 */
public class find_the_string_you_want {

    public static int solution(String myString, String pat){
        int answer = 0;

        if(myString.toUpperCase().contains(pat.toUpperCase()) == true){
            answer = 1;
        }else {
            answer = 0;
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution("AbCdEfG","aBc");
        solution("aaAA","aaaaa");
    }
}
