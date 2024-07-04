package programmers.coding.codingLevel0;
/**
 * TITLE : 편지
 * LEVEL : 0
 */
public class letter {

    public static int solution(String message){
        int answer = 0;

        answer = message.length()*2;

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {

        solution("happy birthday!");
        solution("I love you~");
    }
}
