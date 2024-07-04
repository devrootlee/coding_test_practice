package programmers.coding.codingLevel0;
/**
 * TITLE : 공백으로 비교하기 2
 * LEVEL : 0
 */
public class separate_by_space_2 {

    public static String[] solution(String my_string){
        my_string = my_string.trim().replaceAll("\\s+", " ");
        String[] answer = my_string.split(" ");

        for(int i = 0; i<answer.length; i++){
            System.out.println(answer[i]);
        }


        return answer;
    }

    public static void main(String[] args) {
        solution("i    love  you");
        solution("    programmers  ");
        solution("f fd skf ee");
    }
}
