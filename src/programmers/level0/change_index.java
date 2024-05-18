package programmers.level0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * TITLE : 인덱스 바꾸기
 * LEVEL : 0
 */
public class change_index {
    public static String solution(String my_string, int num1, int num2) {
        String answer = "";
        List<Character> list = new ArrayList();

        for(int i = 0; i<my_string.length(); i++){
            list.add(my_string.charAt(i));
        }

        Collections.swap(list,num1,num2);

        for(int i = 0; i < list.size(); i++){
            answer += list.get(i);
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution("hello",1,2);
        solution("i love you",3,6);
    }
}
