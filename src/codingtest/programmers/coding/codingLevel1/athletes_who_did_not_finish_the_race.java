package codingtest.programmers.coding.codingLevel1;

import java.util.*;

/**
 * TITLE : 완주하지 못한 선수
 * LEVEL : 1
 */
public class athletes_who_did_not_finish_the_race {

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> hashMap = new HashMap<>();

        for(String player : participant){
            hashMap.put(player,hashMap.getOrDefault(player,0)+1);
        }

        for(String player : completion){
            hashMap.put(player,hashMap.get(player) - 1);
        }

        for(String key : hashMap.keySet()){
            if(hashMap.get(key) != 0){
                answer = key;
            }
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        String[] part1 ={"leo", "kiki", "eden"};
        String[] part2 ={"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] part3 ={"mislav", "stanko", "mislav", "ana"};
        String[] compl1 = {"eden", "kiki"};
        String[] compl2 = {"josipa", "filipa", "marina", "nikola"};
        String[] compl3 = {"stanko", "ana", "mislav"};

        solution(part1,compl1);
        solution(part2,compl2);
        solution(part3,compl3);
    }
}
