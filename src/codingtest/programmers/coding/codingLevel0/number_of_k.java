package codingtest.programmers.coding.codingLevel0;
/**
 * TITLE : k의 개수
 * LEVEL : 0
 */
public class number_of_k {

    public static int solution(int i, int j, int k) {
        int answer = 0;
        char kChar = (char)(k+'0');

        for(int m = i; m <= j; m++){
            String f = String.valueOf(m);

            for(int n = 0; n < f.length(); n++){
                if(kChar == f.charAt(n)) answer++;
            }
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(1,13,1);
        solution(10,50,5);
        solution(3,10,2);
    }
}
