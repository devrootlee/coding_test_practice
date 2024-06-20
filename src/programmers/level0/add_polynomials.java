package programmers.level0;

import java.util.ArrayList;
import java.util.List;

/**
 * TITLE : 다항식 더하기
 * LEVEL : 0
 */
public class add_polynomials {
    public static String solution(String polynomial) {
        String answer = "";
        String strArr[] = polynomial.split(" ");
        int checkX = 0;
        int constant = 0;
        String str1 = "";
        String str2 = "";

        for ( int i = 0 ; i < strArr.length ; i++ ) {

            if ( strArr[i].contains("x") ) {

                checkX += strArr[i].replace("x","") != "" ? Integer.parseInt(strArr[i].replace("x","")) : 1 ;

            } else if ( !strArr[i].equals("+")) {

                constant += Integer.parseInt(strArr[i]);

            }
        }

        str1 = checkX >= 2 ? String.valueOf(checkX)+"x" : (checkX == 1 ? "x" : "");
        str2 = constant > 0 ? (str1.equals("") ? String.valueOf(constant) : " + "+String.valueOf(constant)) : "";
        answer = str1 + str2 ;

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution("1 + 3 + 4");
        solution("11x + 22x + 33x");
        solution("0 + x");
    }
}
