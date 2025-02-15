package codingtest.programmers.coding.codingLevel1;

import java.util.HashMap;

public class babbling2 {

    public static int solution(String[] babbling) {
        int answer = 0;


        HashMap<String, Integer> map = new HashMap<>();
        map.put("aya", 0);
        map.put("ye", 0);
        map.put("woo", 0);
        map.put("ma", 0);

        for (int i = 0; i < babbling.length; i++){
            String attached_str = "";
            String before_str = "";

            for (int j = 0; j < babbling[i].length(); j++){
                attached_str += babbling[i].charAt(j);

                if (map.containsKey(attached_str) && !before_str.equals(attached_str)){
                    before_str = attached_str;
                    attached_str = "";
                }
            }

            if (attached_str.isEmpty()) answer += 1;
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution(new String[]{"aya", "yee", "u", "maa","ayayemaaya"});
        solution(new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"});
    }
}
