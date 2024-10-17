package programmers.coding.codingLevel1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * TITLE : K번째 수
 * LEVEL : 1
 */
public class kth_number {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        List<Integer> answerList = new ArrayList<>();

        for(int i = 0; i < commands.length; i++){
            List<Integer> list = new ArrayList();
            int a = commands[i][0] ;
            int b = commands[i][1];
            int c = commands[i][2];


            for(int j = a - 1; j <= b - 1; j++){
                list.add(array[j]);
            }
            Collections.sort(list);
            answerList.add(list.get(c-1));
        }

        answer = answerList.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,5,2,6,3,7,4};
        int[][] commands1 = {{2,5,3},{4,4,1},{1,7,3}};

        solution(arr1,commands1);

    }
}
