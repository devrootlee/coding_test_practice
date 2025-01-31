package codingtest.programmers.coding.codingLevel1;

import java.util.*;

/**
 * TITLE : 달리기 경주
 * LEVEL : 1
 */
public class running_race {

    public static String[] solution(String[] players, String[] callings) {
        String[] answer = {};

        //선수명과 등수를 map에 넣음
        Map<String,Integer> map = new HashMap();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (String calling : callings) {
            int callingIdx = map.get(calling);

            if (callingIdx != 0) {
                String frontPlayer = players[callingIdx - 1];
                players[callingIdx - 1] = calling;
                players[callingIdx] = frontPlayer;

                map.put(calling, callingIdx - 1);
                map.put(frontPlayer, callingIdx);
            }
        }

        answer = players;

        return answer;
    }

    public static void main(String[] args) {
        solution(new String[]{"mumu", "soe", "poe", "kai", "mine"}, new String[]{"kai", "kai", "mine", "mine"});
        solution(new String[]{"mumu", "soe", "poe", "kai", "mine"}, new String[]{"soe", "mumu", "soe", "kai"});
    }
}
