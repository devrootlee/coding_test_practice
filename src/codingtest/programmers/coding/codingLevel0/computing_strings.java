package codingtest.programmers.coding.codingLevel0;


/**
 * TITLE : 문자열 계산하기
 * LEVEL : 0
 */
public class computing_strings {

    public static int solution(String my_string) {
        int answer = 0;
        String[] str = my_string.split(" ");

        answer = Integer.parseInt(str[0]);
        for(int i = 1; i < str.length; i++){
            if(i % 2 != 0){
                if(str[i].equals("+")){
                    answer += Integer.parseInt(str[i+1]);
                }else {
                    answer -= Integer.parseInt(str[i+1]);
                }
            }
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution("3 + 4");
    }
}
