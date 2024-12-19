package codingtest.programmers.coding.codingLevel1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * TITLE : 명예의 전당
 * LEVEL : 1
 */
public class hall_of_fame {

    public static int[] solution(int k, int[] score) {
        List<Integer> answerList = new ArrayList<>();
        List<Integer> fameList = new ArrayList<>();

        for(int i = 0; i < score.length; i++){
            if(fameList.size() == k){
                if(Collections.min(fameList) < score[i]){
                    fameList.remove(Collections.min(fameList));
                    fameList.add(score[i]);
                }
            }else {
                fameList.add(score[i]);
            }
            answerList.add(Collections.min(fameList));
        }

        int[] answer = new int[answerList.size()];
        for(int i = 0; i < answerList.size(); i++){
            answer[i] = answerList.get(i);
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 100, 20, 150, 1, 100, 200};
        int[] arr2 = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};

        solution(3,arr1);
        solution(4,arr2);
    }
}
