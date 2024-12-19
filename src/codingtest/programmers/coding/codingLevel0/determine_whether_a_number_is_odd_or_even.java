package codingtest.programmers.coding.codingLevel0;

import java.util.Scanner;

/**
 * TITLE : 홀짝 구분하기
 * LEVEL : 0
 */
public class determine_whether_a_number_is_odd_or_even {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n % 2 == 0){
            System.out.println(n + " is even");
        }else{
            System.out.println(n + " is odd");
        }
    }
}
