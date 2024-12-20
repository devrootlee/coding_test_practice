package codingtest.programmers.coding.codingLevel1;

/**
 * TITLE : 콜라츠 추측
 * LEVEL : 1
 */
public class colatz_guess {

    public static int solution(long num) {
        int answer = 0;

        for (;;) {
            if (num == 1) {
                break;
            }

            if (num % 2 == 0) {
                num = num / 2;
                answer++;
            } else {
                num = num * 3 + 1;
                answer++;
            }

        }

        if(answer >= 500){
            answer = -1;
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(6);
        solution(16);
        solution(626331);
        solution(1);
    }
}
