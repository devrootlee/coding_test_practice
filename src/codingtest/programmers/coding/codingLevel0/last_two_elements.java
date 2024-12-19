package codingtest.programmers.coding.codingLevel0;

import java.util.Arrays;

/**
 * TITLE : 마지막 두 원소
 * LEVEL : 0
 */
public class last_two_elements {

    public static int[] solution(int[] num_list) {
        int[] answer = Arrays.copyOf(num_list,num_list.length + 1 );


        if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            answer[answer.length - 1] = num_list[num_list.length - 1] - num_list[num_list.length - 2];
        }else {
            answer[answer.length - 1] = num_list[num_list.length - 1] * 2;
        }

        for(int i = 0; i < answer.length; i++){
            System.out.print(answer[i]);
        }
        System.out.println();

        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 6};
        int[] arr2 = {5, 2, 1, 7, 5};

        solution(arr1);
        solution(arr2);
    }
}
