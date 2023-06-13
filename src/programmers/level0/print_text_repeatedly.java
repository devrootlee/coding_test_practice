package programmers.level0;
/**
 * TITLE : 문자 반복 출력하기
 * LEVEL : 0
 */
public class print_text_repeatedly {

    public static String solution(String my_string, int n){
        String answer = "";

        for(int i = 0; i < my_string.length(); i++){
            for(int j = 0; j < n; j++){
                answer += String.valueOf(my_string.charAt(i));
            }
        }


        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution("hello",3);
    }
}
