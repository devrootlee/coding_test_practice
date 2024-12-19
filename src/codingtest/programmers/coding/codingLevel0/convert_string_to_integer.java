package codingtest.programmers.coding.codingLevel0;
/**
 * TITLE : 문자열을 정수로 변환하기
 * LEVEL : 0
 */
public class convert_string_to_integer {

    public static int solution(String n_str){
        int answer = 0;

        answer = Integer.parseInt(n_str);

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution("10");
        solution("8452");
    }
}
