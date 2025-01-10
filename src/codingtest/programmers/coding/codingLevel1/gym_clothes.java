package codingtest.programmers.coding.codingLevel1;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * TITLE : 체육복
 * LEVEL : 1
 */
public class gym_clothes {

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        //잃어버린 학생들
        List<Integer> lostList = IntStream.of(lost) // IntStream 생성
                .boxed()     // Integer로 박싱
                .collect(Collectors.toList());

        //두벌 가지고 있는 학생들
        List<Integer> reserveList = IntStream.of(reserve) // IntStream 생성
                .boxed()     // Integer로 박싱
                .collect(Collectors.toList());


        //리스트 오름차순으로 변경
        Collections.sort(lostList);
        Collections.sort(reserveList);

        for (int i = reserveList.size() - 1; i >= 0; i--) {
            if (lostList.contains(reserveList.get(i))) {
                lostList.remove((Object) reserveList.get(i));
                reserveList.remove((Object) reserveList.get(i));
            }
        }

        answer = n - lostList.size();

        for (int i = 0; i < reserveList.size(); i++) {
            System.out.println(lostList);

            int reserveItemMinus = reserveList.get(i) - 1;
            int reserveItemPlus = reserveList.get(i) + 1;

            if (lostList.contains(reserveItemMinus)) {
                answer++;
                lostList.remove((Object) reserveItemMinus);

            } else if (lostList.contains(reserveItemPlus)) {
                answer++;
                lostList.remove((Object) reserveItemPlus);
            }

            if (lostList.size() == 0) {
                break;
            }
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
//        solution(5,new int[]{2,4},new int[]{4,1,3,5});
//        solution(5,new int[]{2,4},new int[]{3});
//        solution(3,new int[]{3},new int[]{1});
//        solution(4,new int[]{2,3},new int[]{3,4});
//        solution(10,new int[]{1,2,3,4,5,6},new int[]{1,2,3});
        solution(5,new int[]{4,2},new int[]{3,5});
    }
}
