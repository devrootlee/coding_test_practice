package codingtest.programmers.coding.codingLevel0;
/**
 * TITLE : 두 수의 곱
 * LEVEL : 0
 */
public class product_of_two_numbers {
    public static int solution(int num1,int num2){
        int answer = 0;

        boolean cond = (num1>=0)&(num1<=100)&(num2>=0)&(num2<=100);

        if(cond == true){
            answer = num1 * num2;
        }else {
            answer = -1;
        }

        System.out.println(answer);
        return answer;

    }

    public static void main(String[] args) {
        solution(3,4);
        solution(27,19);
    }

}
