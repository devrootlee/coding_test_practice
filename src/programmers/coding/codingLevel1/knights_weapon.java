package programmers.coding.codingLevel1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * TITLE : 기사단의 무기
 * LEVEL : 1
 */
public class knights_weapon {

    public static int solution(int number, int limit, int power) {
        int answer = 0;

        List<Integer> list = new ArrayList<>();

        int[] divisorCounts = new int[number + 1];

        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j += i) {
                divisorCounts[j]++; // i는 j의 약수
            }
        }
        for(int i = 1; i < divisorCounts.length; i++){
            list.add(divisorCounts[i]);
        }

        for(int i = 0; i < list.size(); i++){
            if(list.get(i) > limit){
                list.set(i,power);
            }
        }

        answer = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution(5,3,2);
        solution(10,3,2);
        solution(15,10,1);
    }
}
