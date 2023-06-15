package programmers.level0;
/**
 * TITLE : 세균 증식
 * LEVEL : 0
 */
public class bacterial_growth {

    public static int solution(int n, int t) {
        int answer = n;

        for(int i = 0; i<t; i++)
        {
            answer *= 2;
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(2,10);
        solution(7,15);
    }
}
