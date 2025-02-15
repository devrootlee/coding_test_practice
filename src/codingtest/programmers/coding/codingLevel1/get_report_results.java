package codingtest.programmers.coding.codingLevel1;

import java.util.*;

/**
 * TITLE : 신고 결과 받기
 * LEVEL : 1
 */
public class get_report_results {

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        //누가 누구를 신고했는지 저장
        Map<String, Set<String>> reportHistory = new HashMap<>();
        //각각의 사용자가 신고받은 횟수
        Map<String, Integer> reportCount = new HashMap<>();

        //신고 내역 저장
        for (String r : report) {
            String reporter = r.split(" ")[0];
            String reported = r.split(" ")[1];

            //신고자 초기화
            reportHistory.putIfAbsent(reporter, new HashSet<>());

            //중복 신고 방지
            if (reportHistory.get(reporter).add(reported)) {
                reportCount.put(reported, reportCount.getOrDefault(reported, 0) +1);
            }
        }

        //정지된 유저들 생성
        Set<String> bannedUsers = new HashSet<>();
        for (Map.Entry<String, Integer> entry : reportCount.entrySet()) {
            if (entry.getValue() >= k) {
                bannedUsers.add(entry.getKey());
            }
        }

        answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            String user = id_list[i];
            if (reportHistory.containsKey(user)) {
                for (String reportedUser : reportHistory.get(user)) {
                    if (bannedUsers.contains(reportedUser)) {
                        answer[i]++;
                    }
                }
            }
        }

        //map to int[]
        //answer = answerMap.values().stream().mapToInt(Integer::intValue).toArray();

        System.out.println(Arrays.toString(answer));

        return answer;
    }

    public static void main(String[] args) {
        solution(new String[]{"muzi", "frodo", "apeach", "neo"}, new String[]{"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"}, 2);
        solution(new String[]{"con", "ryan"}, new String[]{"ryan con", "ryan con", "ryan con", "ryan con"}, 3);
    }
}
