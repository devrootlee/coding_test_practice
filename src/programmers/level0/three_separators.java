package programmers.level0;

import java.util.ArrayList;
import java.util.List;

/**
 * TITLE : 세 개의 구분자
 * LEVEL : 0
 */
public class three_separators {
    public static String[] solution(String myStr) {
        String[] answer = {};
        List<String> list = new ArrayList();
        String temp = "";

        for(int i = 0; i < myStr.length(); i++){
            if(myStr.charAt(i) == 'a' || myStr.charAt(i) == 'b' || myStr.charAt(i) == 'c'){
                if(temp != ""){
                    list.add(temp);
                    temp = "";
                }
            }else {
                temp += myStr.charAt(i);
            }
        }
        if(temp!=""){
            list.add(temp);
            temp = "";
        }

        if(list.size() == 0){
            list.add("EMPTY");
        }

        answer = new String[list.size()];

        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
    public static void main(String[] args) {
        solution("baconlettucetomato");
        solution("abcd");
        solution("cabab");
    }
}
