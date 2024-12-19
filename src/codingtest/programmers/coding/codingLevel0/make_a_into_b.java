package codingtest.programmers.coding.codingLevel0;

import java.util.Arrays;

/**
 * TITLE : A로 B만들기
 * LEVEL : 0
 */
public class make_a_into_b {

    public static int solution(String before, String after) {
        int answer = 0;

        char[] beforeSort = before.toCharArray();
        char[] afterSort = after.toCharArray();
        Arrays.sort(beforeSort);
        Arrays.sort(afterSort);

        if(Arrays.equals(beforeSort,afterSort)){
            answer = 1;
        }else {
            answer = 0;
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution("olleh","hello");
        solution("allpe","apple");
    }
}
