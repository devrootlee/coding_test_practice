package codingtest.programmers.coding.codingLevel1;
/**
 * TITLE : 서울에서 김서방 찾기
 * LEVEL : 1
 */
public class find_kim_seobang_in_Seoul {

    public static String solution(String[] seoul) {
        String answer = "";
        String index = "";

        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
                index = String.valueOf(i);
            }
        }

        answer = "김서방은 "+ index +"에 있다";

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        String[] str = {"Jane","Kim"};
        solution(str);
    }
}
