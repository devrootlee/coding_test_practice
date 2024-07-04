package programmers.coding.codingLevel0;

import java.util.Scanner;

/**
 * TITLE : 대소문자 바꿔 출력하기
 * LEVEL : 0
 */
public class print_with_case_changed {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";

        for(Character c : a.toCharArray()){
            if(Character.isUpperCase(c)){
                result += Character.toLowerCase(c);
            }else {
                result += Character.toUpperCase(c);
            }
        }


        System.out.println(result);

    }
}
