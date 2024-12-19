package codingtest.programmers.coding.codingLevel0;
/**
 * TITLE : 잘라서 배열로 저장하기
 * LEVEL : 0
 */
public class cut_and_save_as_array {

    public static String[] solution(String my_str, int n) {
        int divide = my_str.length() / n;
        int remain = (my_str.length() % n > 0) ? 1 : 0;
        String[] answer = new String[divide + remain];

        for(int i = 0; i <answer.length; i++){
            int a = n*i;
            int b = n*(i+1);

            if(b>my_str.length()){
                b = my_str.length();
                answer[i] = my_str.substring(a,b);

                break;
            }else {
                answer[i] = my_str.substring(a,b);
            }

        }

        for(int i = 0; i <answer.length; i++){

            System.out.println(answer[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        solution("abc1Addfggg4556b",6);
        solution("abcdef123",3);
    }
}
