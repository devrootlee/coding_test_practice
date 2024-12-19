package codingtest.programmers.coding.codingLevel1;
/**
 * TITLE : 시저 암호
 * LEVEL : 1
 */
public class caesar_cipher {

    public static String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        //대문자 65 ~ 90
        //소문자 97 ~122
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(c == ' '){
                answer.append(c);
            }else if(Character.isUpperCase(c)){//대문자
                answer.append((char) ((c - 'A' + n) % 26 + 'A'));
            }else if(Character.isLowerCase(c)){//소문자
                answer.append((char) ((c - 'a' + n) % 26 + 'a'));
            }
        }

        System.out.println(answer);

        return answer.toString();
    }

    public static void main(String[] args) {
//        solution("A B",1);
//        solution("z",1);
        solution("z",3);
    }
}
