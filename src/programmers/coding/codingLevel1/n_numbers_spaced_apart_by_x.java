package programmers.coding.codingLevel1;
/**
 * TITLE : x만큼 간격이 있는 n개의 숫자
 * LEVEL : 1
 */
public class n_numbers_spaced_apart_by_x {

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];

        for(int i = 0; i < n; i++){
            answer[i] = (long) x * (i + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(2,5);
        solution(4,3);
        solution(-4,2);
    }
}
