package programmers.level0;
/**
 * TITLE : 숨어있는 숫자의 덧셈
 * LEVEL : 0
 */
public class addition_of_hidden_numbers {

    public static int solution(String my_string) {
        int answer = 0;
        char ch;

        for(int i=0; i<my_string.length(); i++){
            ch = my_string.charAt(i);
            if(48<=ch&&ch<=57){

                answer += Character.getNumericValue(ch);
            }
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution("aAb1B2cC34oOp");
        solution("1a2b3c4d123");
    }
}
