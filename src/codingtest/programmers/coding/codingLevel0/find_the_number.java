package codingtest.programmers.coding.codingLevel0;
/**
 * TITLE : 숫자 찾기
 * LEVEL : 0
 */
public class find_the_number {

    public static int solution(int num, int k) {
        int answer = 0;
        String strNum = String.valueOf(num);
        char findNum = (char) (k+'0');


        for(int i = 0; i < strNum.length(); i++){
            if(strNum.charAt(i) == findNum){
                answer = i + 1;
                break;
            }else {
                answer = -1;
            }
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution(29183,1);
        solution(232443,4);
        solution(123456,7);
    }
}
