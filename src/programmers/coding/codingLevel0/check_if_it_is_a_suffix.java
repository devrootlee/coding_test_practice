package programmers.coding.codingLevel0;
/**
 * TITLE : 접미사인지 확인하기
 * LEVEL : 0
 */
public class check_if_it_is_a_suffix {

    public static int solution(String my_string,String is_suffix){
        int answer = 0;

        for(int i = 0; i < my_string.length(); i++){

            if(my_string.substring(i).equals(is_suffix)){
                answer = 1;
                break;
            }else {
                answer = 0;
            }
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution("banana","ana");
        solution("banana","nan");
        solution("banana","wxyz");
        solution("banana","abanana");
    }
}
