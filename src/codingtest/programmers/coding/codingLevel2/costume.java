package codingtest.programmers.coding.codingLevel2;

import java.util.HashMap;

/**
 * TITLE : 의상
 * LEVEL : 2
 */
public class costume {
    public static int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String,Integer> hashMap = new HashMap();

        for(int i = 0; i < clothes.length; i++){
            hashMap.put(clothes[i][1],hashMap.getOrDefault(clothes[i][1],0) + 1);
        }

        System.out.println(hashMap);


        for(String item : hashMap.keySet()){

            int add = hashMap.get(item) + 1;
            answer *= add;
        }

        answer = answer - 1;
        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        String[][] str1 = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        String[][] str2 = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        String[][] str3 = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "face"}};

        solution(str1);
        solution(str2);
        solution(str3);
    }
}
