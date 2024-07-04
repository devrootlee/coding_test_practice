package programmers.coding.codingLevel0;
/**
 * TITLE : 문자열 뒤집기
 * LEVEL : 0
 */
public class flip_string {

    public static String solution(String my_string, int s, int e) {
        String answer = "";
        StringBuilder stringBuilder = new StringBuilder(my_string.substring(s,e+1));
        stringBuilder.reverse();
        answer = my_string.replace(my_string.substring(s,e+1),stringBuilder);

        System.out.print(answer);
        System.out.println();
        return answer;
    }

    public static void main(String[] args) {
        solution("Progra21Sremm3",6,12);
        solution("Stanley1yelnatS",4,10);
    }
}
