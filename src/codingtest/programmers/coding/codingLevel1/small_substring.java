package codingtest.programmers.coding.codingLevel1;
/**
 * TITLE : 크기가 작은 부분 문자열
 * LEVEL : 1
 */
public class small_substring {

    public static int solution(String t, String p) {
        int answer = 0;

        for(int i = 0; i < t.length() - p.length() + 1; i++) {
            long k = Long.valueOf(t.substring(i,p.length() + i));

            if ( Long.valueOf(p) >= k) {
                answer++;
            }
        }

        System.out.println(answer);

        return answer;
    }
    public static void main(String[] args) {
        solution("3141592","271");
        solution("500220839878","7");
        solution("10203","15");
        solution("99999999999999","99999999999999");
    }
}
