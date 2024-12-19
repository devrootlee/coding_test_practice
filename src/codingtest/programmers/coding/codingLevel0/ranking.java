package codingtest.programmers.coding.codingLevel0;

import java.util.*;

/**
 * TITLE : 등수 매기기
 * LEVEL : 0
 */
public class ranking {

    public static int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        List<Map<String,Object>> list = new ArrayList<>();

        for(int i = 0; i <score.length; i++){
            Map<String,Object> map = new LinkedHashMap<>();
            map.put("idx", i);
            map.put("avg", (double)(score[i][0] + score[i][1]) / 2);

            list.add(map);
        }

        // 평균별로 내림차순
        list.sort(
                Comparator.comparing(
                        (Map<String, Object> map) -> (double)map.get("avg")
                ).reversed() //reversed는 내림차순이다. reversed를 지우면 오름차순이다.
        );

        double max = (double)list.get(0).get("avg");
        int rank = 1;

        for(int i = 0; i < list.size(); i++){
            if(max == (double)list.get(i).get("avg")){
                max = (double)list.get(i).get("avg");
                list.get(i).put("rank",rank);
            }else if(max > (double)list.get(i).get("avg")){
                max = (double)list.get(i).get("avg");

                rank = i + 1;

                list.get(i).put("rank",rank);
            }
        }

        System.out.println(list);

        // 인덱스별로 오름차순
        list.sort(
                Comparator.comparing(
                        (Map<String, Object> map) -> (Integer)map.get("idx")
                ) //reversed는 내림차순이다. reversed를 지우면 오름차순이다.
        );

        for(int i = 0; i < answer.length; i++){
            answer[i] = (int)list.get(i).get("rank");
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        int[][] intArr1 = {{80,70},{90,50},{40,70},{50,80}};
        int[][] intArr2 = {{80,70},{70,80},{70,80},{30,50},{90,100},{100,100},{10,30}};

//        solution(intArr1);
        solution(intArr2);
    }
}
