package programmers.level0;

import java.util.Arrays;


/**
 * TITLE : 뒤에서 5등까지
 * LEVEL : 0
 */
public class from_back_to_fifth {

    public static int[] solution(int[] num_list){
        int[] answer = new int[5];

        Arrays.sort(num_list);

        for(int i =0; i<answer.length; i++){
            answer[i] = num_list[i];

            System.out.println(answer[i]);
        }


        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {12,4,15,46,38,1,14};

        solution(arr1);
    }
}
