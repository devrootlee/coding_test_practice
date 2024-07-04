package programmers.coding.codingLevel0;
/**
 * TITLE : 주사위 게임 1
 * LEVEL : 0
 */
public class dice_game_1 {

    public static int solution(int a, int b){
        int answer = 0;

        if((a % 2 == 1)&&(b % 2 == 1)){
            answer = a * a + b * b;
        }else if((a % 2 == 1)||(b % 2 == 1)){
            answer = 2 * (a + b);
        }else {
            answer = Math.abs(a - b);
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(3,5);
        solution(6,1);
        solution(2,4);
    }
}
