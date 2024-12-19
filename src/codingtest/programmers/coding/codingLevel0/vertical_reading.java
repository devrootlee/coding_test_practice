package codingtest.programmers.coding.codingLevel0;
/**
 * TITLE : 세로 읽기
 * LEVEL : 0
 */
public class vertical_reading {

    public static String solution(String my_string, int m, int c) {
        String answer = "";
        String[][] str = new String[my_string.length()/m][m];
        int cnt = 0;

        for(int i = 0; i < my_string.length()/m; i++){
            for(int j = 0; j <m; j++){
                str[i][j] = String.valueOf(my_string.charAt(cnt));
                cnt++;
            }
        }


        for(int i = 0; i < my_string.length()/m; i++){
            answer = answer + str[i][c-1];
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution("ihrhbakrfpndopljhygc",4,2);
        solution("programmers",1,1);
    }
}
