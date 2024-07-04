package programmers.coding.codingLevel0;

import java.util.Scanner;
/**
 * TITLE : 문자열 반복적으로 출력하기
 * LEVEL : 0
 */
public class printing_a_string_repeatedly {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.print(str);
        }

    }
}
