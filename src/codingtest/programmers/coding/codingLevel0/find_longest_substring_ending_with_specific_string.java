package codingtest.programmers.coding.codingLevel0;
/**
 * TITLE : 특정 문자열로 끝나는 가장 긴 부분 문자열 찾기
 * LEVEL : 0
 */
public class find_longest_substring_ending_with_specific_string {
    public static String solution(String myString, String pat) {
        String answer = "";
        String str = myString;

        for(int j = 0; j < pat.length(); j++){
            str = str.replace(pat.charAt(j),'1');
        }

        int idx = str.lastIndexOf("1");


        for(int i = 0; i <= idx; i++){
            answer = answer + myString.charAt(i);
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution("AbCdEFG","dE");
        solution("AAAAaaaa","a");
    }
}
