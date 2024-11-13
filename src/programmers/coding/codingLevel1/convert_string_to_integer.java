package programmers.coding.codingLevel1;
/**
 * TITLE : 문자열을 정수로 바꾸기
 * LEVEL : 1
 */
public class convert_string_to_integer {

    public static int solution(String s) {
        int answer;

        answer = Integer.parseInt(s);

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution("-1234");
    }
}
