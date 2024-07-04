package programmers.coding.codingLevel0;
/**
 * TITLE : 문자열의 뒤의 n글자
 * LEVEL : 0
 */
public class last_n_characters_of_string {


    public static String solution(String my_string, int n){
        String answer = "";

//        for(int i = my_string.length()-1; i > my_string.length()-n-1; i--){
//            System.out.println(my_string.charAt(i));
//        }

        for(int i = my_string.length() - n; i < my_string.length(); i++){
            answer = answer.concat(String.valueOf(my_string.charAt(i)));
        }

        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args) {
        solution("ProgrammerS123",11);
        solution("He110W0r1d",5);
    }
}
