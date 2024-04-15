package programmers.level0;

import java.util.ArrayList;
import java.util.List;

/**
 * TITLE : 배열 만들기3
 * LEVEL : 0
 */
public class create_an_array3 {

    public static int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        int size = 0;
        List<Integer> list = new ArrayList();

        for(int i = 0; i < intervals.length; i++){
            int start = intervals[i][0];
            int end = intervals[i][1];

            size = size + end - start + 1;

            for(int j = start; j <= end; j++){
                list.add(arr[j]);
            }
        }
        answer = new int[size];

        for(int i = 0 ; i < list.size(); i++){
            answer[i] = list.get(i);
        }


        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[][] intervals1 = {{1,3},{0,4}};

        solution(arr1,intervals1);
    }
}
