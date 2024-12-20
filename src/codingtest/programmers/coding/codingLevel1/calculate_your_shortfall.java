package codingtest.programmers.coding.codingLevel1;
/**
 * TITLE : 부족한 금액 계산하기
 * LEVEL : 1
 */
public class calculate_your_shortfall {

    public static long solution(int price, int money, int count) {
        long answer = 0;

        for (int i = 1; i <= count; i++) {
            answer += price * i;
        }

        if (money - answer < 0) {
            answer = answer - money;
        } else {
            answer = 0;
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(3,20,4);
    }
}
