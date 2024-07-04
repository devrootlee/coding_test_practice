package programmers.coding.codingLevel0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * TITLE : 최대값 만들기(2)
 * LEVEL : 0
 */
public class create_max_2 {

    public static int solution(int[] numbers) {
        int answer = 0;
        List<Integer> list = new ArrayList();

        for(int i =0; i<numbers.length; i++){
            for(int j =i+1; j< numbers.length; j++){
                list.add(numbers[i]*numbers[j]);
            }
        }

        answer = Collections.max(list);

        System.out.println(answer);
        return answer;
    }


    public static void main(String[] args) {
        int[] arr1 = {1,2,-3,4,-5};
        int[] arr2 = {0,-31,24,10,1,9};
        int[] arr3 = {10,20,30,5,5,20,5};

        solution(arr1);
        solution(arr2);
        solution(arr3);
    }
}
