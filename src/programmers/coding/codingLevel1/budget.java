package programmers.coding.codingLevel1;

import java.util.Arrays;

/**
 * TITLE : 예산
 * LEVEL : 1
 */
public class budget {

    public static int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        for(int i = 0; i < d.length; i++){
            budget = budget - d[i];

            if(budget >= 0){
                answer++;
            }
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[]d1 = {1,3,2,5,4};
        int[]d2 = {2,2,3,3};

        solution(d1,9);
        solution(d2,10);
    }
}
