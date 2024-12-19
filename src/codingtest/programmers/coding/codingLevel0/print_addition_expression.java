package codingtest.programmers.coding.codingLevel0;

import java.util.Scanner;

/**
 * TITLE : 덧셈식 출력하기
 * LEVEL : 0
 */
public class print_addition_expression {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + " + " + b + " = " + (a + b));
    }
}
