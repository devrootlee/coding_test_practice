package programmers.coding.codingLevel0;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * TITLE : 중복된 문자 제거
 * LEVEL : 0
 */
public class remove_duplicate_characters {
    public static String solution(String my_string) {
        String answer = "";
        List<Character> list = new ArrayList();

        for(int i = 0; i < my_string.length(); i++){
            list.add(my_string.charAt(i));
        }

        list = list.stream().distinct().collect(Collectors.toList());


        for(int i = 0; i < list.size(); i++){
            answer = answer + list.get(i);
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution("people");
        solution("We are the world");
    }
}
