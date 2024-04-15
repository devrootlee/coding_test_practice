package programmers.level0;

import java.util.ArrayList;
import java.util.List;

/**
 * TITLE : 2의 영역
 * LEVEL : 0
 */
public class area_of_2 {

    public static int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> idx = new ArrayList();
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                idx.add(i);
            }
        }

        if(idx.size() == 0){
            answer = new int[1];
            list.add(-1);

            for(int i = 0; i<answer.length; i++){
                answer[i] =list.get(i);
            }

        }else{

            for(int i = idx.get(0); i <= idx.get(idx.size()-1); i++){
                list.add(arr[i]);
            }

            answer = new int[idx.get(idx.size()-1) - idx.get(0) + 1];

            for(int i = 0; i < answer.length; i++){
                answer[i] = list.get(i);
            }

        }

        for(int i = 0; i < answer.length; i++){
            System.out.print(answer[i]);
        }
        System.out.println();
        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,1,4,5,2,9};
        int[] arr2 = {1,2,1};
        int[] arr3 = {1,1,1};
        int[] arr4 = {1,2,1,2,1,10,2,1};

        solution(arr1);
        solution(arr2);
        solution(arr3);
        solution(arr4);
    }
}
