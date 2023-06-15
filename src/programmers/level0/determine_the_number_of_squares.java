package programmers.level0;
/**
 * TITLE : 제곱수 판별하기
 * LEVEL : 0
 */
public class determine_the_number_of_squares {
    public static int solution(int n) {
        int answer = 0;
        Double x = Math.sqrt(n);
        if(x==x.intValue()){
            answer = 1;
        }else{
            answer = 2;
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(144);
        solution(976);
    }
}
