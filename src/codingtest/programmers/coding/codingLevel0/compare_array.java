package codingtest.programmers.coding.codingLevel0;

import java.util.Arrays;

/**
 * TITLE : 배열 비교하기
 * LEVEL : 0
 */
public class compare_array {

    public static int solution(int[] arr1, int[] arr2){
        int answer = 0;

        if (arr1.length > arr2.length){
            answer = 1;
        }else if(arr1.length < arr2.length){
            answer = -1;
        }
        else if(arr1.length == arr2.length){
            if(Arrays.stream(arr1).sum() > Arrays.stream(arr2).sum()){
                answer = 1;
            }else if(Arrays.stream(arr1).sum() < Arrays.stream(arr2).sum()){
                answer = -1;
            }else {
                answer = 0;
            }
        }


        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {49,13};
        int[] arr2 = {70,11,2};
        int[] arr3 = {100,17,84,1};
        int[] arr4 = {55,12,65,36};
        int[] arr5 = {1,2,3,4,5};
        int[] arr6 = {3,3,3,3,3};

        solution(arr1,arr2);
        solution(arr3,arr4);
        solution(arr5,arr6);
    }
}
