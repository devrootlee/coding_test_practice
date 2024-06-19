package programmers.level0;

import java.util.ArrayList;
import java.util.List;

/**
 * TITLE : 약수 구하기
 * LEVEL : 0
 */
public class finding_divisors {

    public static int[] solution(int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                list.add(i);
            }
        }

        answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(24);
        solution(29);
    }
}
