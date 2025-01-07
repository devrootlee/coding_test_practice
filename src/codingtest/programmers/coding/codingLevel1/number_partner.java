package codingtest.programmers.coding.codingLevel1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * TITLE : 숫자 짝꿍
 * LEVEL : 1
 */
public class number_partner {

    public static String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();

        // 각 문자열에서 등장하는 숫자의 빈도를 저장하는 배열
        int[] freqX = new int[10];
        int[] freqY = new int[10];

        // X와 Y에서 각각 숫자의 등장 빈도 계산
        for (char c : X.toCharArray()) {
            freqX[c - '0']++;
        }
        for (char c : Y.toCharArray()) {
            freqY[c - '0']++;
        }

        // 공통되는 숫자들을 찾아내고, 그 숫자의 빈도만큼 정답에 추가
        for (int i = 9; i >= 0; i--) {
            int commonCount = Math.min(freqX[i], freqY[i]);  // 두 문자열에서 공통된 숫자의 개수
            for (int j = 0; j < commonCount; j++) {
                answer.append(i);  // 숫자를 추가
            }
        }

        // 결과가 빈 문자열이면 "-1" 반환
        if (answer.length() == 0) {
            answer.append("-1");
        }

        // 0이 여러 번 나온 경우 처리
        if (answer.charAt(0) == '0') {
            answer.setLength(1);
        }

//        System.out.println(answer);

        return answer.toString();
    }

    public static void main(String[] args) {
        solution("100","2345");
        solution("100","203045");
        solution("100","123450");
        solution("12321","42531");
        solution("5525","1255");
    }
}
