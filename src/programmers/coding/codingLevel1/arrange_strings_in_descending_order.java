package programmers.coding.codingLevel1;

import java.util.*;

/**
 * TITLE : 문자열 내림차순으로 배치하기
 * LEVEL : 1
 */
public class arrange_strings_in_descending_order {

    public static String solution(String s) {
        String answer = "";
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < s.length(); i++){
            list.add((int) s.charAt(i));
        }

        Collections.sort(list,Collections.reverseOrder());

        for(int i = 0; i < list.size(); i++){
            answer += (char) list.get(i).intValue();
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution("Zbcdefg");
    }
}
