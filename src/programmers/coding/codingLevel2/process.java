package programmers.coding.codingLevel2;

import java.util.*;
/**
 * TITLE : 전화번호 목록
 * LEVEL : 2
 */
public class process {

    public static int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<Map<Integer,Integer>> queue = new LinkedList<>();
        List<Integer> key = new ArrayList<>();

        for(int i = 0; i < priorities.length; i++){
            Map<Integer,Integer> map = new HashMap<>();
            map.put(i,priorities[i]);
            queue.offer(map);
        }

        while(!queue.isEmpty()){
            int max = queue.stream()
                    .flatMap(map -> map.values().stream())
                    .max(Integer::compareTo)
                    .orElse(Integer.MIN_VALUE);

            Map mapValues = queue.poll();
            Object[] mapValuesArr = mapValues.values().toArray();
            int arrValues = (int)mapValuesArr[0];
            Object[] mapIndexArr = mapValues.keySet().toArray();
            int arrIndex = (int)mapIndexArr[0];

            if(arrValues < max){
                queue.offer(mapValues);
            }else {
                key.add(arrIndex);
            }

        }

        for(int i = 0; i < key.size(); i++){
            if(key.get(i) == location){
                answer = i+1;
            }
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        int[] prior1 = {2,1,3,2};
        int[] prior2 = {1,1,9,1,1,1};

        solution(prior1,2);
        solution(prior2,0);
    }
}
