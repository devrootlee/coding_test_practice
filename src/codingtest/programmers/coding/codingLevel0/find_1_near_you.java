package codingtest.programmers.coding.codingLevel0;

import java.util.ArrayList;
import java.util.List;

/**
 * TITLE : 가까운 1 찾기
 * LEVEL : 0
 */
public class find_1_near_you {

    public static int solution(int[] arr, int idx) {
        int answer = 0;
        List<Integer> list = new ArrayList();

        for(int i = idx; i < arr.length; i++){
            if(arr[i] == 1){
                list.add(i);
            }
        }

        if(list.size()!=0){
            answer = list.get(0);
        }else {
            answer = -1;
        }

        System.out.println(answer);
        return answer;
    }


    public static void main(String[] args) {
        int[] arr1 = {0,0,0,1};
        int[] arr2 = {1,0,0,1,0,0};
        int[] arr3 = {1,1,1,1,0};

        solution(arr1,1);
        solution(arr2,4);
        solution(arr3,3);
    }
}
