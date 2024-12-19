package codingtest.programmers.coding.codingLevel0;

/**
 * TITLE : 문자열 정수의 합
 * LEVEL : 0
 */
public class sum_of_string_integers {

    public static int solution(String num_str){
        int answer = 0;

        for(int i = 0; i < num_str.length(); i++){

            answer += Character.getNumericValue(num_str.charAt(i));
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution("123456789");
        solution("10000000");
    }
}
