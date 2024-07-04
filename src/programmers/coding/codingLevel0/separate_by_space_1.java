package programmers.coding.codingLevel0;
/**
 * TITLE : 공백으로 구분하기 1
 * LEVEL : 0
 */
public class separate_by_space_1 {

    public static String[] solution(String my_string){
        String[] answer = new String[my_string.split(" ").length];

        for(int i = 0; i < answer.length; i++){
            answer[i] = my_string.split(" ")[i];

            System.out.print(answer[i]);
        }

        System.out.println();

        return answer;
    }

    public static void main(String[] args) {
        solution("i love you");
        solution("programmers");
    }
}
