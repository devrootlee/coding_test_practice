package programmers.level0;

/**
 * TITLE : 문자열 섞기
 * LEVEL : 0
 */
public class shuffle_strings {

    public static String solution(String str1, String str2) {
        String answer = "";

        for(int i=0; i<str1.length(); i++){
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }

        System.out.println(answer);

        return answer;
    }


    public static void main(String[] args) {
        solution("aaaaa","bbbbb");

    }
}
