package codingtest.programmers.coding.codingLevel1;
/**
 * TITLE : 내적
 * LEVEL : 1
 */
public class dot_product {

    public static int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{1,2,3,4},new int[]{-3,-1,0,2});
        solution(new int[]{-1,0,1},new int[]{1,0,-1});
    }
}
