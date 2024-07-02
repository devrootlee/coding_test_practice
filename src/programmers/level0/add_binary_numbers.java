package programmers.level0;
/**
 * TITLE : 이진수 더하기
 * LEVEL : 0
 */
public class add_binary_numbers {

    public static String solution(String bin1, String bin2) {
        String answer = "";

        answer = Integer.toBinaryString(Integer.parseInt(bin1,2) + Integer.parseInt(bin2,2));

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution("10","11");
        solution("1001","1111");
    }
}
