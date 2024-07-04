package programmers.coding.codingLevel0;
/**
 * TITLE : 정수 부분
 * LEVEL : 0
 */
public class integer_part {

    public static int solution(double flo){
        int answer = 0;

        answer = (int)flo;

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution(1.42);
        solution(69.32);
    }
}
