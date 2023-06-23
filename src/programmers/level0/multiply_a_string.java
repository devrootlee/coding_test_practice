package programmers.level0;
/**
 * TITLE : 문자열 곱하기
 * LEVEL : 0
 */
public class multiply_a_string {

    public static String solution(String my_string, int k){
        String answer = "";

        for(int i = 0; i < k; i++){
            answer += my_string;
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution("string",3);
        solution("love",10);
    }
}
