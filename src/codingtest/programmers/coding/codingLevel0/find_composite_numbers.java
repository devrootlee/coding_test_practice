package codingtest.programmers.coding.codingLevel0;
/**
 * TITLE : 합성수 찾기
 * LEVEL : 0
 */
public class find_composite_numbers {

    public static int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= n; i++){
            int cnt = 0;

            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    cnt++;
                }
            }

            if(cnt >= 3){
                answer++;
            }
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(10);
        solution(15);
    }
}
