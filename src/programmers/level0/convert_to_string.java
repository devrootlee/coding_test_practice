package programmers.level0;
/**
 * TITLE : 문자열로 변환
 * LEVEL : 0
 */
public class convert_to_string {

    public static String solution(int n){
        String answer = "";

        answer = String.valueOf(n);

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution(123);
        solution(2573);
    }
}
