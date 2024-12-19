package codingtest.programmers.coding.codingLevel0;

import java.util.ArrayList;
import java.util.List;

/**
 * TITLE : 배열 만들기6
 * LEVEL : 0
 */
public class create_an_array6 {
    public static int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(list.isEmpty()){
                list.add(arr[i]);
            }else {
                if(list.get(list.size() - 1) == arr[i]){
                    list.remove(list.size() - 1);
                }else {
                    list.add(arr[i]);
                }
            }
        }

        if(list.isEmpty()){
            list.add(-1);
        }

        answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
            System.out.println(answer[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {0,1,1,1,0};
        int[] arr2 = {0,1,0,1,0};
        int[] arr3 = {0,1,1,0};

        solution(arr1);
        solution(arr2);
        solution(arr3);
    }
}
