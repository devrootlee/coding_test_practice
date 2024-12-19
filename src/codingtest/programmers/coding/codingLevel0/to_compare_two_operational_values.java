package codingtest.programmers.coding.codingLevel0;
/**
 * TITLE : 두 수의 연산값 비교하기
 * LEVEL : 0
 */
public class to_compare_two_operational_values {

    public static int solution(int a, int b) {
        int answer = 0;
        int apb = Integer.parseInt(String.valueOf(a)+String.valueOf(b));
        int twoab = 2*a*b;

        if(apb > twoab){
            answer = apb;
        }else if(apb < twoab){
            answer = twoab;
        }
        else if( apb == twoab){
            answer = apb;
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {



        solution(2,91);
        solution(91,2);
    }
}
