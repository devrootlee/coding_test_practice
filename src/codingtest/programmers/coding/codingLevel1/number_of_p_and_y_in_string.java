package codingtest.programmers.coding.codingLevel1;
/**
 * TITLE : 문자열 내 p와 y의 개수
 * LEVEL : 1
 */
public class number_of_p_and_y_in_string {
    static boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P'){
                p++;
            } else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
                y++;
            }
        }

        if (p != y){
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        solution("pPoooyY");
        solution("Pyy");
    }
}
