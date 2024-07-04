package programmers.coding.codingLevel0;
/**
 * TITLE : 치킨 쿠폰
 * LEVEL : 0
 */
public class chicken_coupon {

    public static int solution(int chicken){
        int answer = 0;
        int sum = 0;
        int rm = 0;

        while(chicken>=10){

            sum = chicken/10;
            rm = chicken%10;


            chicken = sum + rm;

            answer += sum;
        }


        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(100);
        solution(1081);
    }
}
