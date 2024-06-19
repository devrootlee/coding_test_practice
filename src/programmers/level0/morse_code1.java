package programmers.level0;

import java.util.HashMap;
import java.util.Map;

/**
 * TITLE : 모스부호(1)
 * LEVEL : 0
 */
public class morse_code1 {

    public static String solution(String letter) {
        String answer = "";
        String[] split = letter.split("\\s");

        Map<String,String> morseCode = new HashMap<String,String>(){{
            put(".-","a"); put("-...","b"); put("-.-.","c"); put("-..","d"); put(".","e"); put("..-.","f");
            put("--.","g"); put("....","h"); put("..","i"); put(".---","j"); put("-.-","k"); put(".-..","l");
            put("--","m"); put("-.","n"); put("---","o"); put(".--.","p"); put("--.-","q"); put(".-.","r");
            put("...","s"); put("-","t"); put("..-","u"); put("...-","v"); put(".--","w"); put("-..-","x");
            put("-.--","y"); put("--..","z");
        }};

        for(int i = 0; i < split.length; i++){
            answer = answer + morseCode.get(split[i]);
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(".... . .-.. .-.. ---");
        solution(".--. -.-- - .... --- -.");
    }
}
