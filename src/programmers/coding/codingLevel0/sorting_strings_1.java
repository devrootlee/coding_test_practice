package programmers.coding.codingLevel0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * TITLE : 문자열 정렬하기(1)
 * LEVEL : 0
 */
public class sorting_strings_1 {

    public static int[] solution(String my_string) {
        int[] answer = {};
        List list = new ArrayList();
        my_string = my_string.replaceAll("[^0-9]", "");

        for(int i=0; i<my_string.length(); i++){
            list.add(my_string.charAt(i));
        }
        answer = new int[list.size()];
        Collections.sort(list);

        for(int i =0; i<answer.length; i++){
            answer[i] = Integer.parseInt(list.get(i).toString());

            System.out.println(answer[i]);
        }


        return answer;
    }

    public static void main(String[] args) {
        String string1 = "hi12392";
        String string2 = "p2o4i8gj2";
        String string3 = "abcde0";

        solution(string1);
        solution(string2);
        solution(string3);
    }
}
