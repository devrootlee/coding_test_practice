package codingtest.programmers.coding.codingLevel1;

import java.util.Scanner;

/**
 * TITLE : 직사각형 별찍기
 * LEVEL : 1
 */
public class rectangular_star {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 0; i < b; i++){
            for(int j = 0; j < a; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
