package codingtest.programmers.coding.codingLevel1;

import java.util.Arrays;

/**
 * TITLE : 가장 가까운 같은 글자
 * LEVEL : 1
 */
public class closest_same_letter {

    public static int[] solution(String s) {
        int[] answer = new int[s.length()];

        String sClone = "";
        for (int i = 0; i <s.length(); i++) {
            if (sClone.indexOf(s.charAt(i)) == -1) {
                answer[i] = -1;
            } else {
                answer[i] = i - sClone.lastIndexOf(s.charAt(i));
            }
            sClone += s.charAt(i);
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        solution("banana");
        solution("foobar");
    }
}
