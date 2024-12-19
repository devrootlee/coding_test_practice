package codingtest.programmers.coding.codingLevel2;

import java.util.*;

/**
 * TITLE : H-Index
 * LEVEL : 2
 */
public class H_Index {

    public static int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);
        int n = citations.length;

        for(int i = 0; i < n; i++){
            if(citations[n - 1 - i] >= (i + 1)){
                answer = i +1;
            }else {
                break;
            }
        }

        System.out.println(answer);
//        System.out.println(Arrays.toString(citations));

        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {4,4,4,4,5};

        solution(arr1);
    }
}
