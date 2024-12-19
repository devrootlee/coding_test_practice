package codingtest.programmers.coding.codingLevel0;
/**
 * TITLE : 저주의 숫자3
 * LEVEL : 0
 */
public class cursed_number3 {

    public static int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= n; i++){
            answer++;

            while((answer % 3 == 0 || String.valueOf(answer).contains("3"))){
                ++answer;
            }

        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
//        solution(10);
        solution(40);
    }
}
