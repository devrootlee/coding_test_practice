package programmers.coding.codingLevel0;

/**
 * TITLE : 양꼬치
 * LEVEL : 0
 */
public class lamb_skewers {

    public static int solution(int n, int k) {
        int answer = 0;
        k = k - (n/10);

        answer += n*12000 + k*2000;

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(10, 3);
        solution(64, 6);
    }
}
