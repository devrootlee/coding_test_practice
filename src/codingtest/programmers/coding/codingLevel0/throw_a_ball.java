package codingtest.programmers.coding.codingLevel0;

import java.util.ArrayList;
import java.util.List;

/**
 * TITLE : 공 던지기
 * LEVEL : 0
 */
public class throw_a_ball {

    public static int solution(int[] numbers, int k) {
        int answer = 0;
        int num = 0;

        for(int i = 0; i <k; i++){
            List<Integer> list = new ArrayList<>();
            for(int j = num; j < numbers.length; j++){
                list.add(numbers[j]);
            }

           if(numbers.length > num + 2){
               num = num + 2;
           }else if(numbers.length <= num + 2){

               if(numbers.length < num + 2){
                   num = 1;
               }else if(numbers.length == num + 2){
                   num = 0;
               }
           }
            answer = list.get(0);
        }

        num = 0;

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,2,3,4,5,6};
        int[] arr3 = {1,2,3};

        solution(arr1,2);
        solution(arr2,5);
        solution(arr3,3);
    }
}
