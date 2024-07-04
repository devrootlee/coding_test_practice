package programmers.coding.codingLevel0;

import java.util.ArrayList;
import java.util.List;

/**
 * TITLE : 순서 바꾸기
 * LEVEL : 0
 */
public class change_order {

    public static int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        List<Integer> list = new ArrayList<>();

        for(int i = n; i<num_list.length; i++){
          list.add(num_list[i]);
        }

        for(int i = 0; i<n; i++){
            list.add(num_list[i]);
        }

        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }


        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {2,1,6};
        int[] arr2 = {5,2,1,7,5};

        solution(arr1,1);
        solution(arr2,3);


    }
}
