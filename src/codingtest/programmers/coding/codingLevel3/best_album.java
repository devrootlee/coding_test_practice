package codingtest.programmers.coding.codingLevel3;

import java.util.*;

/**
 * TITLE : 베스트앨범
 * LEVEL : 3
 */
public class best_album {

    public static int[] solution(String[] genres, int[] plays) {
        List<Integer> answer = new ArrayList<>();

        Map<String, Map<Integer, Integer>> maps = new HashMap<>();

        for (String genre : genres) {
            maps.put(genre, new HashMap<>());
        }

        for (int i = 0; i < genres.length; i++) {
            maps.get(genres[i]).put(i, plays[i]);
        }

        Map<String, Integer> maps2 = new HashMap<>();

        for (String s : maps.keySet()) {
            maps2.put(s, maps.get(s).values().stream().mapToInt(n -> n).sum());
        }

        List<String> keySetList = new ArrayList<>(maps2.keySet());

        keySetList.sort((o1, o2) -> (maps2.get(o2).compareTo(maps2.get(o1))));

        keySetList.forEach(s -> {
            Map<Integer, Integer> asdf = maps.get(s);

            List<Integer> integers = new ArrayList<>(asdf.keySet());

            integers.sort((o1, o2) -> (asdf.get(o2).compareTo(asdf.get(o1))));

            if (integers.size() <= 1) {
                answer.add(integers.get(0));
            } else {
                answer.add(integers.get(0));
                answer.add(integers.get(1));
            }
        });

        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        String[] genres1 = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays1 = {500, 600, 150, 800, 2500};

        solution(genres1, plays1);
    }
}
