package programmers.coding.codingLevel1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * TITLE : 최대공약수와 최소공배수
 * LEVEL : 1
 */
public class greatest_common_divisor_and_least_common_multiple {

    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        int greatestCommonDivisor = 0;
        int leastCommonMultiple = n * m;

        //유클리드 호제법
        if(n > m){
            while(m != 0){
                int temp = m;
                m = n % m;
                n = temp;
            }
            greatestCommonDivisor = n;
        }else {
            while(n != 0){
                int temp = n;
                n = m % n;
                m = temp;
            }
            greatestCommonDivisor = m;
        }

        answer[0] = greatestCommonDivisor;
        answer[1] = leastCommonMultiple / greatestCommonDivisor;

        System.out.println(Arrays.toString(answer));

        return answer;
    }

    public static void main(String[] args) {
        solution(2,13);
        solution(2,5);
    }
}
