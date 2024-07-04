package programmers.coding.codingLevel0;

import java.util.Scanner;

/**
 * TITLE : 문자열 돌리기
 * LEVEL : 0
 */
public class twist_the_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for(int i=0; i<a.length(); i++){
            System.out.println(a.charAt(i));
        }
    }
}
