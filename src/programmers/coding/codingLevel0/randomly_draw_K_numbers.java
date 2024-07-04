package programmers.coding.codingLevel0;

import java.util.ArrayList;
import java.util.List;


/**
 * TITLE : 무작위로 K개의 수 뽑기
 * LEVEL : 0
 */
public class randomly_draw_K_numbers {
    public static int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        List<Integer> list = new ArrayList();

        for(int i = 0; i < arr.length; i++){
            if(!list.contains(arr[i])){
                if(list.size() < k){
                    list.add(arr[i]);
                }
            }
        }

        for(int i = 0; i < answer.length; i++){
            if(!(list.size() - 1 < i)){
                answer[i] = list.get(i);
            }else {
                answer[i] = -1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {0,1,1,2,2,3};
        int[] arr2 = {0,1,1,1,1};

        solution(arr1,3);
        solution(arr2,4);
    }
}
