package programmers.level0;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

/**
 * TITLE : 문자열 잘라서 정렬하기
 * LEVEL : 0
 */
public class cut_and_sort_strings {
    public static String[] solution(String myString) {
        List<String> strList = new ArrayList<>();

        String[] splitStr = myString.split("x");
        for(int i = 0; i < splitStr.length; i++){
            if(!splitStr[i].isEmpty()){
                strList.add(splitStr[i]);
            }
        }

        String[] answer = new String[strList.size()];
        strList.toArray(answer);
        Arrays.sort(answer);

        for(int i = 0; i < strList.size(); i++){
            System.out.print(answer[i]);
        }
        System.out.println();

        return answer;
    }

    public static void main(String[] args) {
        solution("axxbxx");
        solution("dxccxbbbxaaaa");
    }
}
