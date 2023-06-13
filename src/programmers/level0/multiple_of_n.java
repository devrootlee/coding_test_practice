package programmers.level0;
/**
 * TITLE : n의 배수
 * LEVEL : 0
 */
public class multiple_of_n {

    public static int solution(int num, int n){
        int answer = 0;

        if(num % n == 0){
            answer = 1;
        }else{
            answer = 0;
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {

        solution(98,2);
        solution(34,3);
        solution(4,1);
    }
}
