package codingtest.programmers.coding.codingLevel0;
/**
 * TITLE : 부분 문자열
 * LEVEL : 0
 */
public class substring {

    public static int solution(String str1, String str2) {
        int answer = 0;

        if(str2.contains(str1)){
            answer = 1;
        }else {
            answer = 0;
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution("abc","aabcc");
        solution("tbt","tbbttb");
    }
}
