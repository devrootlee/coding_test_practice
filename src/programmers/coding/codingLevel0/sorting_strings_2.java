package programmers.coding.codingLevel0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/**
 * TITLE : 문자열 정렬하기2
 * LEVEL : 0
 */
public class sorting_strings_2 {
    public static String solution(String my_string) {
        my_string = my_string.toLowerCase(Locale.ROOT);

        String answer = "";
        List<Character> list = new ArrayList<>();

        for(int i = 0; i < my_string.length(); i++){
            list.add(my_string.charAt(i));
        }

        Collections.sort(list);

        for(int i = 0; i < list.size(); i++){
            answer += list.get(i);
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution("Bcad");
        solution("heLLo");
        solution("Python");
    }
}
