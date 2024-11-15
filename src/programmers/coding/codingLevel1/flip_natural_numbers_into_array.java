package programmers.coding.codingLevel1;

import java.util.Arrays;

/**
 * TITLE : 자연수 뒤집어 배열로 만들기
 * LEVEL : 1
 */
public class flip_natural_numbers_into_array {

    public static int[] solution(long n) {
        String strN = String.valueOf(n);

        int[] answer = new int[strN.length()];

        for (int i = 0; i < strN.length(); i++) {
            answer[i] = strN.charAt(i) - '0';
        }


        for (int i = 0; i < answer.length / 2; i++) {
            int temp = answer[i];
            answer[i] = answer[answer.length - 1 - i];
            answer[answer.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(answer));

        return answer;
    }

    public static void main(String[] args) {
        solution(12345);
    }
}
