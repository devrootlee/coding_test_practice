package codingtest.programmers.coding.codingLevel0;

import java.util.*;
import java.util.stream.Collectors;

/**
 * TITLE : 전국대회 선발 고사
 * LEVEL : 0
 */
public class national_competition_selection_test {
    public static int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i <rank.length; i++){
            if(attendance[i] == false){
                rank[i] = 0;
            }
        }

        for(int i = 0; i <rank.length; i++){
            if(rank[i] != 0){
                map.put(i,rank[i]);
            }
        }


        map = map.entrySet()
                .stream()
                .sorted((i1, i2)
                        -> i1.getValue().compareTo(
                        i2.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(map);

        List<Integer> list = new ArrayList<>();

        for(Integer key : map.keySet()){
            if(list.size() < 3){
                list.add(key);
            }
        }

        answer = 10000 * list.get(0) + 100 * list.get(1) + list.get(2);

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        int[] intArr1 = {3, 7, 2, 5, 4, 6, 1};
        int[] intArr2 = {1, 2, 3};
        int[] intArr3 = {6, 1, 5, 2, 3, 4};

        boolean[] boolArr1 = {false, true, true, true, true, false, false};
        boolean[] boolArr2 = {true, true, true};
        boolean[] boolArr3 = {true, false, true, false, false, true};

        solution(intArr1,boolArr1);
        solution(intArr2,boolArr2);
        solution(intArr3,boolArr3);
    }
}
