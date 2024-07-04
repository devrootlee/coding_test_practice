package programmers.coding.codingLevel0;
/**
 * TITLE : 두 수의 나눗셈
 * LEVEL : 0
 */
public class division_of_two_numbers {
    public static int solution(int num1, int num2){
        double answer = 0;
        boolean cond = (num1>0)&(num1<=100)&(num2>0)&(num2<=100);

        if(cond == true){
            answer = ((double)num1/(double)num2)*1000;
        }else{
            answer = -1;
        }

        System.out.println((int)answer);
        return (int)answer;
    }

    public static void main(String[] args) {
        solution(3,2);
        solution(7,3);
        solution(1,16);
    }
}
