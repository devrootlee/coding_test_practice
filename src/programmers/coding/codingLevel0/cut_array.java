package programmers.coding.codingLevel0;

import java.util.Arrays;

/**
 * TITLE : 배열 자르기
 * LEVEL : 0
 */
public class cut_array {
    public static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};

        answer = Arrays.copyOfRange(numbers,num1,num2+1);


        for(int i : answer){
            System.out.println(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 3, 5};

        solution(arr1, 1, 3);
        solution(arr2, 1, 2);
    }
}
