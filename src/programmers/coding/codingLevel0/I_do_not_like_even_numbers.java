package programmers.coding.codingLevel0;

import java.util.ArrayList;
import java.util.List;

/**
 * TITLE : 짝수는 싫어요
 * LEVEL : 0
 */
public class I_do_not_like_even_numbers {

    public static List solution(int n){
        List answer = new ArrayList<>();

        for(int i = 0; i <=n; i++){
            if(i % 2 != 0){
                answer.add(i);
            }
        }
        System.out.println(answer);


        return answer;
    }

    public static void main(String[] args) {
        solution(10);
        solution(15);
    }
}
