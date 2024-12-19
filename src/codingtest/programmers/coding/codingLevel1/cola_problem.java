package codingtest.programmers.coding.codingLevel1;
/**
 * TITLE : 콜라 문제
 * LEVEL : 1
 */
public class cola_problem {

    public static int solution(int a, int b, int n) {
        int answer = 0;
        int cola = 0;

        while(true){
            cola = (b * (n / a));
            System.out.println(cola);
            answer += cola;
            n = n - (a * (n / a)) + (b * (n / a));
            if(n == a){
                answer++;
                break;
            }else if(n <= a) {
                break;
            }
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(2,1,20);
        solution(3,1,20);
    }
}
