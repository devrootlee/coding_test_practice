package codingtest.programmers.coding.codingLevel0;

/**
 * TITLE : 문자 개수 세기
 * LEVEL : 0
 */
public class counting_characters {

    public static int[] solution(String my_string) {
        int[] answer = new int[52];

        for(int i = 0; i < my_string.length(); i++){

            if(Character.isUpperCase(my_string.charAt(i))){
                answer[(int)my_string.charAt(i) - 65]++;
            }else{
                answer[(int)my_string.charAt(i) - 65 - 6]++;
            }
        }


        for(int i = 0; i < answer.length; i++){
            System.out.print(answer[i]);
        }


        return answer;
    }

    public static void main(String[] args) {
        solution("Programmers");
    }
}
