package codingtest.programmers.coding.codingLevel1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * TITLE : 정수 내림차순으로 배치하기
 * LEVEL : 1
 */
public class sort_by_integer_in_descending_order {

    public static long solution(long n) {
        long answer = 0;

        String strN = String.valueOf(n);
        List<Character> list = new ArrayList<>();

        for(int i = 0; i < strN.length(); i++){
            list.add(strN.charAt(i));
        }

        Collections.sort(list, Comparator.reverseOrder());
        String answerStr = "";
        for(int i = 0; i < list.size(); i++){
            answerStr+=list.get(i);
        }

        answer = Long.parseLong(answerStr);

        System.out.println(answerStr);

        return answer;
    }

    public static void main(String[] args) {
        solution(118372);
    }
}
