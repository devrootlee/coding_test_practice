package codingtest.programmers.coding.codingLevel0;

/**
 * TITLE : 구슬을 나누는 경우의 수
 * LEVEL : 0
 */
public class number_of_ways_to_divide_beads {

    public static double solution(int balls, int share) {
        double answer = 1;

        for(int i = 0; i < share; i++){
            answer = answer * (balls - i) / (i+1);
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(5,3);
//        solution(5,3);
    }
}
