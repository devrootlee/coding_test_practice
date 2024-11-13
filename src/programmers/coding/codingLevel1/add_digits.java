package programmers.coding.codingLevel1;
/**
 * TITLE : 자릿수 더하기
 * LEVEL : 1
 */
public class add_digits {
    public static int solution(int n) {
        int answer = 0;
        String strN = String.valueOf(n);

        for(int i = 0; i < strN.length(); i++){
            answer += strN.charAt(i) - '0';
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(123);
        solution(987);
    }
}
