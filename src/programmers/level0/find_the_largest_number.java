package programmers.level0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * TITLE : 가장 큰 수 찾기
 * LEVEL : 0
 */
public class find_the_largest_number {

    public static int[] solution(int[] array) {
        int[] answer = new int[2];
        List list = new ArrayList();

        for(int i = 0; i < array.length; i++){
            list.add(array[i]);
        }

        int max = Integer.parseInt(Collections.max(list).toString());

        answer[0] = max;

        for(int i = 0; i < array.length; i++){
            if(max == array[i]){
                answer[1] = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,8,3};
        int[] arr2 = {9,10,11,8};

        solution(arr1);
        solution(arr2);
    }
}
