package codingtest.programmers.coding.codingLevel1;
/**
 * TITLE : [PCCP 기출문제] 1번/붕대 감기
 * LEVEL : 1
 */
public class bandage {

    public static int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;

        //초당 회복량
        int bandageSecHeal = bandage[1];
        //연속성공 시간
        int bandageSuccessStreakTime = bandage[0];
        //연속성공 회복량
        int bandageSuccessHeal = bandage[2];
        
        //최대 최력
        int fullHealth = health;
        //연속 성공
        int successStreak = 0;

        int attackStart = 0;

        int lastAttackTime = attacks[attacks.length - 1][0];

        for (int time = 0; time <= lastAttackTime; time++) {
            //공격 시간 체크 : 공격
            if (time == attacks[attackStart][0]) {
                answer -= attacks[attackStart][1];

                //체력이 0이면 끝
                if (answer <= 0) {
                    break;
                }

                attackStart += 1;
                successStreak = 0; // 연속 성공 초기화
            } else { //공격 시간이 아니면
                successStreak++;
                
                if (successStreak == bandageSuccessStreakTime) { //연속성공 힐
                    answer += bandageSecHeal;
                    answer += bandageSuccessHeal;

                    successStreak = 0;
                } else { //일반적인 힐
                    answer += bandageSecHeal;
                }

                if (answer > fullHealth) {
                    answer = fullHealth;
                }
            }

//            System.out.println(answer);
        }

        if (answer <= 0) answer = -1;

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{5, 1, 5}, 30, new int[][]{{2, 10}, {9, 15}, {10, 5}, {11, 5}});
        solution(new int[]{3, 2, 7}, 20, new int[][]{{1, 15}, {5, 16}, {8, 6}});
        solution(new int[]{4, 2, 7}, 20, new int[][]{{1, 15}, {5, 16}, {8, 6}});
        solution(new int[]{1, 1, 1}, 5, new int[][]{{1, 2}, {3, 2}});
        solution(new int[]{1, 1, 1}, 20, new int[][]{{1, 5}, {4, 1}});
    }
}
