package codingtest.programmers.coding.codingLevel1;

import java.util.Arrays;

/**
 * TITLE : 나누어 떨어지는 숫자 배열
 * LEVEL : 1
 */
public class array_of_numbers_that_fall_apart {

    public static int[] solution(int[] arr, int divisor) {
        int[] answer = {};

        int dCnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                dCnt++;
            }
        }

        if (dCnt == 0) {
            answer = new int[]{-1};
        } else {
            answer = new int[dCnt];

            int idx = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % divisor == 0) {
                    answer[idx] = arr[i];
                    idx++;
                }
            }
        }

        Arrays.sort(answer);

        System.out.println(Arrays.toString(answer));

        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{5,9,7,10},5);
        solution(new int[]{2,35,1,3},1);
        solution(new int[]{3,2,6},10);
    }
}
