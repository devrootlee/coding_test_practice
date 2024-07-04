package programmers.coding.codingLevel0;

import java.util.ArrayList;
import java.util.List;

/**
 * TITLE : 순서쌍의 개수
 * LEVEL : 0
 */
public class numbers_of_ordered_pairs {

    public static int solution(int n) {
        int answer = 0;
        List list = new ArrayList();

        for (int i = 1; i <= n; i++) {
            if(n%i == 0){
                list.add(i);
            }
        }

        answer = list.size();

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(20);
        solution(100);
    }
}
