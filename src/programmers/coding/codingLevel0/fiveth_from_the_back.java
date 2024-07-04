package programmers.coding.codingLevel0;

import java.util.Arrays;

/**
 * TITLE : 뒤에서 5등 위로
 * LEVEL : 0
 */
public class fiveth_from_the_back {

    public static int[] solution(int[] num_list){
        int[] answer = new int[num_list.length - 5];
        Arrays.sort(num_list);

        for(int i =0; i<answer.length; i++){
            answer[i] = num_list[i+5];

            System.out.print(answer[i]+" ");
        }
        System.out.println();

        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {12,4,15,46,38,1,14,56,32,10};
        int[] arr2 = {1,2,3,4,5,6,7,8,9,10,11,12,13};

        solution(arr1);
        solution(arr2);
    }
}
