package programmers.coding.codingLevel1;


import java.time.LocalDate;

/**
 * TITLE : 2016
 * LEVEL : 1
 */
public class year_2016 {
    public static String solution(int a, int b) {
        String answer = "";

        LocalDate date = LocalDate.of(2016,a,b);
        answer = date.getDayOfWeek().toString().substring(0,3);
        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution(5,24);
    }
}
