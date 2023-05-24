package programmers.level0;

/**
 * TITLE : 몫 구하기
 * LEVEL : 0
 */
public class find_a_share {

    public static int solution(int num1, int num2) {
        int answer = 0;

        if((num1>=0)&(num1<=100)&(num2>=0)&(num2<=100)){

            answer = num1/num2;
        }else{
            return 0;
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {

        solution(10,5);
        solution(7,2);

    }
}
