package codingtest.programmers.coding.codingLevel1;

import java.util.Arrays;

/**
 * TITLE : 로또의 최고 순위와 최저 순위
 * LEVEL : 1
 */
public class highest_and_lowest_lotto_rankings {

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        long sameNum = Arrays.stream(lottos)
                .filter(num -> Arrays.stream(win_nums)
                    .anyMatch(x -> x == num))
                .count();

        long zeroNum = Arrays.stream(lottos).filter(num -> num == 0).count();

        if (sameNum == 0 & zeroNum == 0) {
            answer[0] = 6;
            answer[1] = 6;

            return answer;
        } else {
            if (sameNum > 0 & zeroNum == 0) {
                answer[0] = 7 - (int) sameNum;
                answer[1] = 7 - (int) sameNum;
            } else if (sameNum == 0 & zeroNum == 6) {
                answer[0] = 7 - (int) zeroNum;
                answer[1] = (int) zeroNum;
            } else {
                answer[0] = 7 - (int) sameNum - (int) zeroNum;
                answer[1] = 7 - (int) sameNum;
            }
        }

        System.out.println(Arrays.toString(answer));

        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19});
        solution(new int[]{0, 0, 0, 0, 0, 0}, new int[]{38, 19, 20, 40, 15, 25});
        solution(new int[]{45, 4, 35, 20, 3, 9}, new int[]{20, 9, 3, 45, 4, 35});
    }
}
