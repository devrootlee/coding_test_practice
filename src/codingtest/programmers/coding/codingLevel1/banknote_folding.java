package codingtest.programmers.coding.codingLevel1;

import java.util.Arrays;

/**
 * TITLE : 지폐 접기
 * LEVEL : 1
 */
public class banknote_folding {

    public static int solution(int[] wallet, int[] bill) {
        int answer = 0;

        while (true) {

            if (wallet[0] >= bill[0] && wallet[1] >= bill[1]) {
                break;
            } else if (wallet[0] >= bill[1] && wallet[1] >= bill[0]) {
                break;
            } else {
                if (bill[0] >= bill[1]) {
                    bill[0] /= 2;
                } else {
                    bill[1] /= 2;

                }
                answer++;
            }
        }

        System.out.println(Arrays.toString(bill));
        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{30, 15}, new int[]{26, 17});
        solution(new int[]{50, 50}, new int[]{100, 241});
    }
}
