package codingtest.programmers.coding.codingLevel1;
/**
 * TITLE : 가운데 글자 가져오기
 * LEVEL : 1
 */
public class get_middle_letter {

    public static String solution(String s) {
        String answer = "";

        if (s.length() % 2 == 0) {//짝수
            answer += s.charAt(s.length() / 2 - 1);
            answer += s.charAt(s.length() / 2);
        }else {//홀수
            answer += s.charAt(s.length()/2);
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution("abcde");
        solution("qwer");
    }
}
