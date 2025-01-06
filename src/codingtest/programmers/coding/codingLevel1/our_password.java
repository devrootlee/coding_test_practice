package codingtest.programmers.coding.codingLevel1;
/**
 * TITLE : 둘만의 암호
 * LEVEL : 1
 */
public class our_password {
// abcdefghijklmnopqrstuvwxyz
    public static String solution(String s, String skip, int index) {
        String answer = "";

        for (int j = 0; j < s.length(); j++) {
            char a = s.charAt(j);

            for (int i = 0; i < index; i++) {

                while(true) {
                    a += 1;

                    if ((int) a >= 123) {
                        a -= 26;
                    }

                    if (!skip.contains(String.valueOf(a))) {
                         break;
                    }
                }
            }
            answer += a;
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution("aukks","wbqd",5);
        solution("y", "baz", 1);
    }
}
