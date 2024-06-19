package programmers.level0;

import java.util.ArrayList;
import java.util.List;

/**
 * TITLE : 조건에 맞게 수열 변환하기 2
 * LEVEL : 0
 */
public class factorization {
    public static int[] solution(int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        for (int i = 2; i<=n; i++){
            while (n % i == 0){
                n= n/i;
                if(!list.contains(i)){
                    list.add(i);
                }
            }
        }

        answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
            System.out.println(answer[i]);
        }


        return answer;
    }
    public static void main(String[] args) {
//        solution(12);
//        solution(17);
        solution(420);
    }
}
