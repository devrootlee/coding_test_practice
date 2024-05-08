package programmers.level0;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * TITLE : 문자열 묶기
 * LEVEL : 0
 */
public class string_string {
    public static int solution(String[] strArr) {
        int answer = 0;
        Map<Integer,Integer> map = new LinkedHashMap();

        for(int i = 0; i < strArr.length; i++){
            if(!map.containsKey((strArr[i].length()))){
                map.put(strArr[i].length(),1);
            }else {
                map.put(strArr[i].length(),map.get(strArr[i].length())+1);
            }
        }

        for(Integer key : map.keySet()){
            if(answer < map.get(key)){
                answer = map.get(key);
            }
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        String[] str1 = {"a","bc","d","efg","hi"};

        solution(str1);
    }
}
