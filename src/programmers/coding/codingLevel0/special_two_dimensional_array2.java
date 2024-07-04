package programmers.coding.codingLevel0;

import java.util.ArrayList;
import java.util.List;

/**
 * TITLE : 특별한 이차원 배열 2
 * LEVEL : 0
 */
public class special_two_dimensional_array2 {

    public static int solution(int[][] arr) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){

                if(arr[i][j] != arr[j][i]){
                    list.add(0);
                }else {
                    list.add(1);
                }
            }
        }

        if(list.contains(0)){
            answer = 0;
        }else {
            answer = 1;
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{5, 192, 33}, {192, 72, 95}, {33, 95, 999}};
        int[][] arr2 = {{19, 498, 258, 587}, {63, 93, 7, 754}, {258, 7, 1000, 723}, {587, 754, 723, 81}};

        solution(arr1);
        solution(arr2);
    }
}
