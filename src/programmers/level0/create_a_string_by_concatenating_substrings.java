package programmers.level0;
/**
 * TITLE : 부분 문자열 이어 붙여 문자열 만들기
 * LEVEL : 0
 */
public class create_a_string_by_concatenating_substrings {

    public static String solution(String[] my_strings, int[][] parts) {
        String answer = "";

        for(int i=0; i<my_strings.length; i++){
            for(int j=0; j<parts.length; j++){
                answer+=my_strings[i].substring(Integer.parseInt(parts[i].toString()),Integer.parseInt(parts[j].toString()));
            }
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        String[] str1 = {"progressive","hamburger","hammer","ahocorasick"};
        int[][] parts1 = {{0,4},{1,2},{3,5},{7,7}};

        solution(str1,parts1);
    }
}
