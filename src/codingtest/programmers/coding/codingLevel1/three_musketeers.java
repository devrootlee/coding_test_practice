package codingtest.programmers.coding.codingLevel1;

import java.util.ArrayList;
import java.util.List;

/**
 * TITLE : 삼총사
 * LEVEL : 1
 */
public class three_musketeers {

    public static int solution(int[] number) {
        int answer = 0;
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) answer++;
                }
            }
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{-2,3,0,2,-5});
        solution(new int[]{-3,-2,-1,0,1,2,3});
        solution(new int[]{-1,1,-1,1});
    }
}
