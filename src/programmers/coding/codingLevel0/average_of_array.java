package programmers.coding.codingLevel0;
/**
 * TITLE : 배열의 평균값
 * LEVEL : 0
 */
public class average_of_array {

    public static double solution(int[] numbers){
        double answer = 0;

        for(int i : numbers){
            answer += i;
        }

        answer = answer / numbers.length;

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[] num1 = {1,2,3,4,5,6,7,8,9,10};
        int[] num2 = {89,90,91,92,93,94,95,96,97,98,99};

        solution(num1);
        solution(num2);
    }
}
