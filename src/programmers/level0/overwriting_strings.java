package programmers.level0;
/**
 * TITLE : 문자열 겹쳐쓰기
 * LEVEL : 0
 */
public class overwriting_strings {
    public static String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        StringBuilder stringBuilder = new StringBuilder(my_string);

        for(int i=0; i<overwrite_string.length(); i++){
            stringBuilder.setCharAt(i+s,overwrite_string.charAt(i));
        }

        answer = stringBuilder.toString();
        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution("He11oWor1d","lloWorl",2);
        solution("Program29b8UYP","merS123",7);

    }
}
