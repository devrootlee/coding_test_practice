package codingtest.programmers.coding.codingLevel0;

/**
 * TITLE : 아이스 아메리카노
 * LEVEL : 0
 */
public class ice_americano {

    public static int[] solution(int money) {
        int[] answer = new int[2];
        int price = 5500;

        answer[0] = money / price;
        answer[1] = money % price;


        System.out.println(answer[0]);
        System.out.println(answer[1]);

        return answer;
    }

    public static void main(String[] args) {
        solution(5500);
        solution(15000);
    }
}
