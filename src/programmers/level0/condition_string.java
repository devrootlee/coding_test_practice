package programmers.level0;
/**
 * TITLE : 조건 문자열
 * LEVEL : 0
 */
public class condition_string {

    public static int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        boolean t;

        if(ineq.equals(">")&&eq.equals("=")){
            t = n >= m;
            if(t == true){
                answer = 1;
            }else {
                answer = 0;
            }
        }else if(ineq.equals("<")&&eq.equals("=")){
            t = n <= m;
            if(t == true){
                answer = 1;
            }else {
                answer = 0;
            }
        }else if(ineq.equals(">")&&eq.equals("!")){
            t = n > m;
            if(t == true){
                answer = 1;
            }else {
                answer = 0;
            }
        }else if(ineq.equals("<")&&eq.equals("!")){
            t = n < m;
            if(t == true){
                answer = 1;
            }else {
                answer = 0;
            }
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {

        solution("<","=",20,50);
        solution(">","!",41,78);

    }
}
