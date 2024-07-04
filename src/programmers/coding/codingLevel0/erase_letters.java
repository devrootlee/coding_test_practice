package programmers.coding.codingLevel0;
/**
 * TITLE : 글자 지우기
 * LEVEL : 0
 */
public class erase_letters {

    public static String solution(String my_string, int[] indices) {
        String answer = "";
        String[] str = new String[my_string.length()];

        for(int i = 0; i < str.length; i++){
            str[i] = String.valueOf(my_string.charAt(i));
        }

        for(int i = 0; i < indices.length; i++){
            str[indices[i]] = "";
        }

        for(int i = 0; i<str.length; i++){
            answer += str[i];
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 16, 6, 15, 0, 10, 11, 3};
        solution("apporoograpemmemprs",arr);
    }
}
