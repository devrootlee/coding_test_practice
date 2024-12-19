package codingtest.programmers.coding.codingLevel0;

/**
 * TITLE : 홀짝에 따라 다른 값 반환하기
 * LEVEL : 0
 */
public class returning_different_values_depending_on_odd_or_even {

    public static int solution(int n) {
        int answer = 0;

        if (n % 2 == 1) {
            for (int i = 0; i <= n; i++) {
                if(i % 2 ==1){
                    answer += i;
                }
            }
        } else {
            for(int i = 1; i <= n; i++){
                if(i % 2 == 0){
                    answer += i*i;
                }
            }
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(7);
        solution(10);
    }
}
