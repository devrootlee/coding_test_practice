package programmers.coding.codingLevel0;

import java.util.ArrayList;
import java.util.List;

/**
 * TITLE : 배열 조각하기
 * LEVEL : 0
 */
public class sculpting_an_array {

    public static int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            list.add(arr[i]);
        }

        for(int i = 0 ; i < query.length; i++){
            // 짝수
            if(i % 2 == 0){
                list = list.subList(0,query[i]+1);
            }else { // 홀수
                list = list.subList(query[i],list.size());
            }
            System.out.println(list);
        }
        answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

//        System.out.println(list);
        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {0,1,2,3,4,5};
        int[] query1 = {4,1,2};

        solution(arr1,query1);
    }
}
