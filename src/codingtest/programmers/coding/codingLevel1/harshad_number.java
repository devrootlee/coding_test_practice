package codingtest.programmers.coding.codingLevel1;
/**
 * TITLE : 하샤드 수
 * LEVEL : 1
 */
public class harshad_number {

    public static boolean solution(int x) {
        boolean answer = true;

        String strX = String.valueOf(x);

        int k = 0;
        for (int i = 0; i < strX.length(); i++) {
            k += strX.charAt(i) - '0';
        }

        if (x % k == 0) {
            answer = true;
        } else {
            answer = false;
        }
        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution(10);
        solution(11);
        solution(12);
        solution(13);
    }
}
