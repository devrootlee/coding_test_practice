package programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * TITLE : 연속된 수의 합
 * LEVEL : 0
 */
public class sum_of_consecutive_numbers {

    public static int[] solution(int num, int total) {
        int[] answer = new int[num];
        int answerTotal = total;

        if(total != 0){
            for(;;){
                List<Integer> list = new ArrayList<>();
                int answerInt = 0;

                for(int i = answerTotal - num + 1; i <= answerTotal; i++){
                    answerInt+=i;
                    list.add(i);
                }

                if(answerInt == total){
                    for(int i = 0; i < answer.length; i++){
                        answer[i] = list.get(i);
                    }
                    break;
                }

                answerTotal -= 1;
            }
        }else {
            List<Integer> list = new ArrayList<>();
            for(int i = -(num / 2); i <= num / 2; i++){
                list.add(i);
            }

            for(int i = 0; i < answer.length; i++){
                answer[i] = list.get(i);
            }
        }


        System.out.println(Arrays.toString(answer));

        return answer;
    }

    public static void main(String[] args) {
//        solution(3,12);
//        solution(5,15);
//        solution(4,14);
//        solution(5,5);
        solution(7,0);
    }
}
