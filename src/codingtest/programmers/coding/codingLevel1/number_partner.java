package codingtest.programmers.coding.codingLevel1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * TITLE : 숫자 짝꿍
 * LEVEL : 1
 */
public class number_partner {

    public static String solution(String X, String Y) {
        String answer = "";
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < X.length(); i++) {
            int yLength = Y.length();
            Y = Y.replaceFirst(String.valueOf(X.charAt(i)),"");

            if (yLength != Y.length()) {
                list.add((int) X.charAt(i) - '0');
            }
        }

        if (list.size() == 0) {
            list.add(-1);
        }

        Collections.sort(list,Collections.reverseOrder());

        for (int item : list) {
            answer += item;
        }

        if (answer.charAt(0) == '0' & answer.length() > 1) {
            answer = "0";
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution("100","2345");
        solution("100","203045");
        solution("100","123450");
        solution("12321","42531");
        solution("5525","1255");
    }
}
