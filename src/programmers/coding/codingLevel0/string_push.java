package programmers.coding.codingLevel0;


/**
 * TITLE : 문자열 밀기
 * LEVEL : 0
 */
public class string_push {
    public static int solution(String A, String B) {
        int answer = 0;
        String copy = A;

        for(int i = 0; i < A.length(); i++){
            if(copy.equals(B)){
                return answer;
            }

            String a = copy.substring(copy.length() - 1);
            copy = a + copy.substring(0,copy.length() - 1);
            answer++;
        }

        return -1;
    }

    public static void main(String[] args) {
        solution("hello","ohell");
        solution("apple","elppa");
        solution("atat","tata");
        solution("abc","abc");
    }
}
