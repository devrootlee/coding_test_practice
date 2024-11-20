package programmers.coding.codingLevel1;

import java.util.Arrays;

/**
 * TITLE : 문자열 내 마음대로 정렬하기
 * LEVEL : 1
 */
public class sort_strings_however_you_want {
    public static String[] solution(String[] strings, int n) {
        String[] answer = {};
        Arrays.sort(strings, (a, b) -> {
            if (a.charAt(n) != b.charAt(n)) {
                return a.charAt(n) - b.charAt(n);
            }
            return a.compareTo(b);
        });

        answer = strings;

        System.out.println(Arrays.toString(answer));

        return answer;
    }

    public static void main(String[] args) {
        String[] str1 = {"sun","bed","car"};
        String[] str2 = {"abce","abcc","cdx"};

        solution(str1,1);
        solution(str2,2);
    }
}
