package codingtest.programmers.coding.codingLevel1;

import java.util.ArrayList;
import java.util.List;

/**
 * TITLE : 문자열 나누기
 * LEVEL : 1
 */
public class split_string {

    public static int solution(String s) {
        int answer = 0;

        int countX = 0;
        int countOther = 0;
        char x = 0;

        for (int i = 0; i < s.length(); i++) {
            if(countX == 0 && countOther == 0) {
                x = s.charAt(i);
                countX++;
            } else {
                if (s.charAt(i) == x) {
                    countX++;
                } else {
                    countOther++;
                }
            }

            if (countX == countOther) {
                answer++;
                countX = 0;
                countOther = 0;
            }
        }

        if (countX != 0 || countOther != 0) {
            answer ++;
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution("banana");
//        solution("abracadabra");
//        solution("aaabbaccccabba");
    }
}
