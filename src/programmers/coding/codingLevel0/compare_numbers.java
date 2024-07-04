package programmers.coding.codingLevel0;
/**
 * TITLE : 숫자 비교하기
 * LEVEL : 0
 */
public class compare_numbers {

    public static int solution(int num1,int num2){
        int answer = 0;
        boolean cond = (num1>=0)&(num1<=10000)&(num2>=0)&(num2<=10000);

        if(cond == true){
            if(num1 == num2){
                answer = 1;
            }else{
                answer = -1;
            }
        }else{
            answer = -1;
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {

        solution(2,3);
        solution(11,11);
        solution(7,99);

    }
}
