package programmers.coding.codingLevel0;

import java.util.ArrayList;
import java.util.List;

/**
 * TITLE : ad 제거하기
 * LEVEL : 0
 */
public class remove_ad {

    public static String[] solution(String[] strArr) {
        String[] answer = {};
        List<String> strList = new ArrayList<>();

        for(int i = 0; i < strArr.length; i++){
            if(strArr[i].contains("ad") == false){
                strList.add(strArr[i]);
            }
        }

        answer = new String[strList.size()];

        for(int i = 0; i < strList.size(); i++){
            answer[i] = strList.get(i);
        }



        return answer;
    }

    public static void main(String[] args) {
        String[] str1 = {"and","notad","abcd"};
        String[] str2 = {"there","are","no","a","ds"};

        solution(str1);
        solution(str2);
    }
}
