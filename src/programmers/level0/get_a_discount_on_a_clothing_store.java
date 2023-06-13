package programmers.level0;
/**
 * TITLE : 옷 가게 할인받기
 * LEVEL : 0
 */
public class get_a_discount_on_a_clothing_store {

    public static int solution(int price) {
        int answer = 0;

        if(price >= 500000) {
            answer = (int)(price * 0.8);
        } else if(price >= 300000) {
            answer = (int)(price * 0.9);
        } else if(price >= 100000) {
            answer = (int)(price * 0.95);
        }else {
            answer = price;
        }


        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(150000);
        solution(580000);
        solution(90010);
    }
}
