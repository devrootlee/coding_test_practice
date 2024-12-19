package codingtest.programmers.coding.codingLevel0;
/**
 * TITLE : 가위 바위 보
 * LEVEL : 0
 */
public class rock_paper_scissors {

    public static String solution(String rsp){
        String answer = "";

        for(int i = 0; i < rsp.length(); i++){

            if(rsp.charAt(i) == '2'){
                answer = answer.concat("0");
            }else if(rsp.charAt(i) == '0'){
                answer = answer.concat("5");
            }else if(rsp.charAt(i) == '5'){
                answer = answer.concat("2");
            }
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution("052");
        solution("205");
    }
}
