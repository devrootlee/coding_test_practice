package codingtest.programmers.coding.codingLevel0;

/**
 * TITLE : 부분 문자열인지 확인하기
 * LEVEL : 0
 */
public class check_if_substring {

    public static int solution(String my_string, String target) {
        int answer = 0;

        if(my_string.contains(target) == true){
            answer = 1;
        }else {
            answer = 0;
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution("banana", "ana");
        solution("banana", "wxyz");
    }
}
