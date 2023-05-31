package programmers.level0;

import java.util.Arrays;
/**
 * TITLE : 중앙값 구하기
 * LEVEL : 0
 */
public class finding_the_median {

    public static int solution(int[] array){
        int answer = 0;
        Arrays.sort(array);

        answer = array[array.length/2];

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,7,10,11};
        int[] arr2 = {9,-1,0};

        solution(arr1);
        solution(arr2);
    }
}
