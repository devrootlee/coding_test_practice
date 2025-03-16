package codingtest.programmers.coding.codingLevel1;


/**
 * TITLE : 유연 근무제
 * LEVEL : 1
 */
public class flexible_workingSystem {
    public static int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;

        int[] prize = new int[schedules.length]; // 각 직원의 출석 횟수

        // 1. 각 직원의 출근 시간에 10분 허용 범위 추가
        for (int i = 0; i < schedules.length; i++) {
            int hours = schedules[i] / 100;
            int minutes = schedules[i] % 100;
            minutes += 10; // 10분 지각 허용
            if (minutes >= 60) {
                hours += minutes / 60;
                minutes = minutes % 60;
            }
            schedules[i] = hours * 100 + minutes; // 조정된 출근 시간
        }

        // 2. 평일 출석 체크
        for (int i = 0; i < timelogs.length; i++) { // 각 직원
            int day = startday; // 시작 요일
            int workdayCount = 0; // 평일 카운터
            for (int j = 0; j < timelogs[i].length && workdayCount < 5; j++) {
                // 주말(6, 7) 제외, 평일만 체크
                if (day <= 5) {
                    if (timelogs[i][j] <= schedules[i]) { // 제시간 출근
                        prize[i]++;
                    }
                    workdayCount++; // 평일 하루 체크
                }
                day++;
                if (day > 7) day = 1; // 일요일 다음은 월요일
            }
        }

        // 3. 5일 모두 출석한 직원 수 계산
        for (int i = 0; i < prize.length; i++) {
            if (prize[i] == 5) {
                answer++;
            }
        }

        System.out.println(answer);
        return answer;
    }


    public static void main(String[] args) {
        solution(new int[]{700,800,1100}, new int[][]{
                {710, 2359, 1050, 700, 650, 631, 659},
                {800, 801, 805, 800, 759, 810, 809},
                {1105, 1001, 1002, 600, 1059, 1001, 1100}
        },5);

        solution(new int[]{730,855,700,720},new int[][]{
                {710, 700, 650, 735, 700, 931, 912},
                {908, 901, 805, 815, 800, 831, 835},
                {705, 701, 702, 705, 710, 710, 711},
                {707, 731, 859, 913, 934, 931, 905}
        }, 1);

    }
}
