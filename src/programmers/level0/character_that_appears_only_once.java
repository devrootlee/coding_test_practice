package programmers.level0;

import java.util.*;

/**
 * TITLE : 인덱스 바꾸기
 * LEVEL : 0
 */
public class character_that_appears_only_once {

    public static String solution(String s) {
        String answer = "";
        List<Character> list = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();

        for(int i = 0; i < s.length(); i++){
            list.add(s.charAt(i));
        }

        for(int i = 0; i < list.size(); i++){
            if(Collections.frequency(list,list.get(i)) == 1){
                list2.add(s.charAt(i));
            }
        }

        Collections.sort(list2);

        for(int i = 0; i < list2.size(); i++){
            answer += list2.get(i);
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution("abcabcadc");
        solution("abdc");
        solution("hello");
    }
}
