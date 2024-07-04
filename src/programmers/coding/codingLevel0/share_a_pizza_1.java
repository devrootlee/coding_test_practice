package programmers.coding.codingLevel0;

/**
 * TITLE : 피자 나눠 먹기(1)
 * LEVEL : 0
 */
public class share_a_pizza_1 {

    public static int solution(int n) {
        int answer = 0;
        int pizza = 7;


        if(n % pizza != 0){
            answer = (n/pizza) + 1;
        }else{
            answer = n/pizza;
        }


        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {

        solution(7);
        solution(1);
        solution(15);
        solution(29);
    }
}
