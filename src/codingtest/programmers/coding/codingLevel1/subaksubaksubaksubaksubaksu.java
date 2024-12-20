package codingtest.programmers.coding.codingLevel1;
/**
 * TITLE : 수박수박수박수박수박수?
 * LEVEL : 1
 */
public class subaksubaksubaksubaksubaksu {

    public static String solution(int n) {
        String answer = "";

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                answer += "수";
            } else if (i % 2 == 0) {
                answer += "박";
            } else {
                answer += "수";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(3);
        solution(4);
    }
}
