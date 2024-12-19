package codingtest.programmers.coding.codingLevel0;
/**
 * TITLE : 피자 나눠 먹기(3)
 * LEVEL : 0
 */
public class share_a_pizza_3 {

    public static int solution(int slice, int n){
        int answer = 0;

        if (n % slice == 0) {
            answer = n / slice;
        }else{
            answer = n / slice + 1;
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(7,10);
        solution(4,12);
    }
}
