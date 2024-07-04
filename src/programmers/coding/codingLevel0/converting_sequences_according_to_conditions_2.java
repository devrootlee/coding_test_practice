package programmers.coding.codingLevel0;

import java.util.Arrays;

/**
 * TITLE : 조건에 맞게 수열 변환하기 2
 * LEVEL : 0
 */
public class converting_sequences_according_to_conditions_2 {
    public static int solution(int[] arr) {
        int answer = 0;
        int[] arr2 = new int[arr.length];

        for (;;) {

            for(int i = 0; i < arr.length; i++) {
                arr2[i] = arr[i];

                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }

            if(Arrays.equals(arr,arr2) == true){
                break;
            }else {
                answer++;
            }
        }


        for(int k =0 ; k < arr.length; k++){
            System.out.print(arr[k] + ",");
        }
        System.out.println();

        for(int k =0 ; k < arr.length; k++){
            System.out.print(arr2[k] + ",");
        }
        System.out.println();

        System.out.println(answer);

        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,100,99,98};

        solution(arr);
    }
}
