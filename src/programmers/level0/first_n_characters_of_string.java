package programmers.level0;
/**
 * TITLE : 문자열의 앞의 n글자
 * LEVEL : 0
 */
public class first_n_characters_of_string {

    public static String solution(String my_string, int n){
        String answer = "";

        for(int i = 0; i < n; i++){
            answer += Character.toString(my_string.charAt(i));
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution("ProgrammerS123",11);
        solution("He110W0r1d",5);
    }
}
