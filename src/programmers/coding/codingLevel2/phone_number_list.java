package programmers.coding.codingLevel2;

import java.util.HashMap;

/**
 * TITLE : 전화번호 목록
 * LEVEL : 2
 */
public class phone_number_list {

    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String,Integer> hashMap = new HashMap<>();

        for(int i = 0; i < phone_book.length; i++){
            hashMap.put(phone_book[i],i);
        }

        for (int i = 0; i < phone_book.length; i++){
            for (int j = 0; j < phone_book[i].length(); j++){
                if (hashMap.containsKey(phone_book[i].substring(0, j))){
                    answer = false;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] str1 = {"119", "97674223", "1195524421"};
        String[] str2 = {"123","456","789"};
        String[] str3 = {"12","123","1235","567","88"};

        solution(str1);
        solution(str2);
        solution(str3);
    }
}
