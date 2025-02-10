package codingtest.programmers.coding.codingLevel1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * TITLE : 신고 결과 받기
 * LEVEL : 1
 */
public class get_report_results {

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};

        //유저 map
        Map<String,Integer> idListMap = new LinkedHashMap();
        for (String item : id_list) {
            idListMap.put(item, 0);
        }

        //신고 당한 횟수 구하기
        Map reportMap = new HashMap();
        Map<String, Integer> reportCntMap = new HashMap();

        for(String item : report) {
            String itemArr0 = item.split(" ")[0];
            String itemArr1 = item.split(" ")[1];

            if (reportMap.get(itemArr0) == null) {
                reportMap.put(itemArr0, itemArr1);
                reportCntMap.put(itemArr1, reportCntMap.getOrDefault(itemArr1, 0) + 1);
            } else if (!reportMap.get(itemArr0).equals(itemArr1)){
                reportMap.put(itemArr0, itemArr1);
                reportCntMap.put(itemArr1, reportCntMap.getOrDefault(itemArr1, 0) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : reportCntMap.entrySet()) {
            //신고당한 횟수가 k 이상인 유저 찾기
            if (entry.getValue() >= k) {

                System.out.println(entry.getKey());

                for (String item : report) {
                    String item0 = item.split(" ")[0];
                    String item1 = item.split(" ")[1];

                    if (entry.getKey().equals(item1)) {
                        idListMap.put(item0, idListMap.getOrDefault(item0, 0) + 1);
                    }
                }
            }
        }

        //mpa to int[]
        answer = idListMap.values().stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(answer));

        return answer;
    }

    public static void main(String[] args) {
        solution(new String[]{"muzi", "frodo", "apeach", "neo"}, new String[]{"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"}, 2);
        solution(new String[]{"con", "ryan"}, new String[]{"ryan con", "ryan con", "ryan con", "ryan con"}, 3);
    }
}
