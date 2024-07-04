package programmers.coding.codingLevel0;
/**
 * TITLE : 접두사인지 확인하기
 * LEVEL : 0
 */
public class check_if_prefix {

    public static int solution(String my_string, String is_prefix) {
        int answer = 0;
        String ori = "";
        String make = "";

        if(my_string.length() >= is_prefix.length()){

            for(int i = 0; i < is_prefix.length(); i++){
                ori += Character.toString(my_string.charAt(i));
                make += Character.toString(is_prefix.charAt(i));

                if(ori.equals(make)){
                    answer = 1;
                }else{
                    answer = 0;
                }
            }


        }else if(my_string.length() > is_prefix.length()){
            answer = 0;
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution("banana","ban");
        solution("banana","nan");
        solution("banana","abcd");
        solution("banana","banana");
        solution("banana","bananan");
    }
}
