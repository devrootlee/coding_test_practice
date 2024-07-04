package programmers.coding.codingLevel0;
/**
 * TITLE : 369게임
 * LEVEL : 0
 */
public class three_six_nine_game {

    public static int solution(int order) {
        int answer = 0;
        String od = String.valueOf(order);

        for(int i = 0; i < od.length(); i++){
            if(od.charAt(i)=='3'){
                answer++;
            } else if(od.charAt(i)=='6'){
                answer++;
            }else if(od.charAt(i)=='9'){
                answer++;
            }
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution(3);
        solution(29423);
    }
}
