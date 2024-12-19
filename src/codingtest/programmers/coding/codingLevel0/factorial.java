package codingtest.programmers.coding.codingLevel0;
/**
 * TITLE : 팩토리얼
 * LEVEL : 0
 */
public class factorial {

    public static int solution(int n) {
        int answer = 0;
        int k = 1;

        for(int i = 1; i <= 10; i++){

            k = k * i;

            if(k > n){
                answer = i - 1;
                break;
            }else if(k == n){
                answer = i;
            }
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(3628800);
        solution(7);
    }
}
