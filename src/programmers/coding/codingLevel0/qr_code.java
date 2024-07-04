package programmers.coding.codingLevel0;
/**
 * TITLE : qr code
 * LEVEL : 0
 */
public class qr_code {

    public static String solution(int q, int r, String code) {
        String answer = "";

        for(int i =0; i < code.length(); i++){
            if(i % q == r){
                answer = answer + code.charAt(i);
            }
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(3,1,"qjnwezgrpirldywt");
        solution(1,0,"programmers");
    }
}
