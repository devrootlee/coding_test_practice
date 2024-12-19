package codingtest.programmers.coding.codingLevel1;

import java.util.Arrays;

/**
 * TITLE : 과일 장수
 * LEVEL : 1
 */
public class fruiterer {

    public static int solution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);
        System.out.println(Arrays.toString(score));
        System.out.println("[" + score[9] + "]");
        for (int i = score.length - m; i >= 0; i -= m) {
            System.out.println(i);
            answer += score[i] * m;
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        int[] score1 = {1, 2, 3, 1, 2, 3, 1};
        int[] score2 = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};

        solution(3, 4, score1);
        solution(4, 3, score2);
    }
}
