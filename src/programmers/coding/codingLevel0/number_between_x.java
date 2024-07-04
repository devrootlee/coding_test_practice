package programmers.coding.codingLevel0;

import java.util.ArrayList;
import java.util.List;

/**
 * TITLE : x 사이의 개수
 * LEVEL : 0
 */
public class number_between_x {
    public static int[] solution(String myString) {
        int[] answer = {};
        List<String> strList = new ArrayList<>();

        String[] splitStr = myString.split("x");
        for(int i = 0; i <splitStr.length; i++){
            strList.add(splitStr[i]);
        }

        if(myString.charAt(myString.length() - 1) == 'x'){
            strList.add("");
        }

        answer = new int[strList.size()];
        for(int i = 0; i < strList.size(); i++){
            answer[i] = strList.get(i).length();
        }



        return answer;
    }
    public static void main(String[] args) {
        solution("oxooxoxxox");
//        solution("xabcxdefxghi");
    }
}
