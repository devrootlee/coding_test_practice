package programmers.level0;

import java.math.BigDecimal;
/**
 * TITLE : 두 수의 합 문자열
 * LEVEL : 0
 */
public class sum_of_two_numbers_string {
    public static String solution(String a, String b) {
        String answer = "";

        BigDecimal one = new BigDecimal(a);
        BigDecimal two = new BigDecimal(b);


        answer = String.valueOf(one.add(two));

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution("582","734");
        solution("18446744073709551615","287346502836570928366");
        solution("0","0");
    }
}
