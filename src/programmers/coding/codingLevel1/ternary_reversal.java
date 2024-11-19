package programmers.coding.codingLevel1;
/**
 * TITLE : 3진법 뒤집기
 * LEVEL : 1
 */
public class ternary_reversal {

    public static int solution(int n) {
        int answer = 0;

        //3진법 구하기
        StringBuilder ternary = new StringBuilder();
        while(n > 0){
            ternary.insert(0, n % 3);
            n = n / 3;
        }
        
        //3진법 뒤집기
        ternary.reverse();

        int three = 1;
        for(int i = ternary.length() - 1 ; i >= 0; i--){
            answer += (ternary.charAt(i) - '0') * three;
            three*=3;
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(45);
        solution(125);
    }
}
