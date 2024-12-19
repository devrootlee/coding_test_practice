package codingtest.programmers.coding.codingLevel0;

/**
 * TITLE : 각도기
 * LEVEL : 0
 */
public class protractor {
    public static int solution(int angle) {
        int answer = 0;
        boolean condAcute = (angle > 0) & (angle < 90);
        boolean condRight = (angle == 90);
        boolean condObtuse = (angle > 90) & (angle < 180);
        boolean condFlat = (angle == 180);

        if(condAcute == true){
            answer = 1;
        }else if(condRight == true){
            answer = 2;
        }else if(condObtuse == true){
            answer = 3;
        }else if(condFlat == true){
            answer = 4;
        }else{
            answer = -1;
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(70);
        solution(91);
        solution(180);
    }
}
