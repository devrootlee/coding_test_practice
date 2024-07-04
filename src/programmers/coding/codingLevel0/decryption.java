package programmers.coding.codingLevel0;

/**
 * TITLE : 암호 해독
 * LEVEL : 0
 */
public class decryption {

    public static String solution(String cipher, int code) {
        String answer = "";

        int length = cipher.length() / code;

        for (int i = 1; i < length + 1; i++) {
            answer = answer.concat(Character.toString(cipher.charAt(i * code - 1)));
        }


        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution("dfjardstddetckdaccccdegk", 4);
        solution("pfqallllabwaoclk", 2);
    }
}
