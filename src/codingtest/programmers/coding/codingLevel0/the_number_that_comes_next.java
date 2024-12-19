package codingtest.programmers.coding.codingLevel0;

import java.util.ArrayList;
import java.util.List;

/**
 * TITLE : 다음에 올 숫자
 * LEVEL : 0
 */
public class the_number_that_comes_next {

    public static int solution(int[] common) {
        int answer = 0;
        List<Integer> list = new ArrayList();

        for(int i = 0; i < common.length - 1; i++){
            list.add(common[i+1] - common[i]);
        }

        if(list.get(0) != list.get(1)){
            answer = common[common.length - 1] * (list.get(1)/list.get(0));
        }else{
            answer = common[common.length - 1] + list.get(0);
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[] intArr1 = {1,2,3,4};
        int[] intArr2 = {2,4,8};

        solution(intArr1);
        solution(intArr2);
    }
}
