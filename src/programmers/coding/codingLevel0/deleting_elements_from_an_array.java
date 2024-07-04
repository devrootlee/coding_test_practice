package programmers.coding.codingLevel0;

import java.util.ArrayList;
import java.util.List;

/**
 * TITLE : 배열의 원소 삭제하기
 * LEVEL : 0
 */
public class deleting_elements_from_an_array {
    public static List solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();

        for(int a : arr){
            answer.add(a);
        }

        for(int i = 0; i < delete_list.length; i++){
            answer.remove(Integer.valueOf(delete_list[i]));
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {293, 1000, 395, 678, 94};
        int[] arr2 = {110, 66, 439, 785, 1};
        int[] deleteList1 = {94, 777, 104, 1000, 1, 12};
        int[] deleteList2 = {377, 823, 119, 43};


        solution(arr1,deleteList1);
        solution(arr2,deleteList2);
    }
}
