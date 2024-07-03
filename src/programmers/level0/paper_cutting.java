package programmers.level0;
/**
 * TITLE : 종이 자르기
 * LEVEL : 0
 */
public class paper_cutting {

    public static int solution(int M, int N) {
        int answer = 0;

        if(M*N == 1){
            answer = 0;
        }else {
            answer = (M - 1) +(M * N - M);
        }

        System.out.println(answer);
        return answer;
    }
    
    public static void main(String[] args) {
        solution(2,2);
        solution(2,5);
        solution(1,1);
    }
}
