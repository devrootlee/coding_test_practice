package programmers.coding.codingLevel1;

import java.util.Arrays;

/**
 * TITLE : 카드 뭉치
 * LEVEL : 1
 */
public class pack_of_card {

    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";

        int cards1Index = 0;
        int cards2Index = 0;

        for(int i = 0; i < goal.length; i++){
            if(cards1[cards1Index].equals(goal[i])){
                answer += cards1[cards1Index];
                answer += ",";
                if(cards1Index+1 < cards1.length){
                    cards1Index++;
                }
            }else if(cards2[cards2Index].equals(goal[i])){
                answer += cards2[cards2Index];
                answer += ",";
                if(cards2Index+1 < cards2.length){
                    cards2Index++;
                }
            }
        }

        String[] str = answer.split(",");

        if(Arrays.equals(str,goal)){
            answer = "Yes";
        }else {
            answer = "No";
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        String[] cards11 = {"i", "drink", "water"};
        String[] cards12 = {"i", "water", "drink"};
        String[] cards13 = {"i", "sadness", "sad"};
        String[] cards21 ={"want", "to"};
        String[] cards22 = {"want", "to"};
        String[] cards23 = {"tired"};
        String[] goals1 = {"i", "want", "to", "drink", "water"};
        String[] goals2 = {"i", "want", "to", "drink", "water"};
        String[] goals3 = {"i", "sadness", "sad", "tired"};

        solution(cards11,cards21,goals1);
        solution(cards12,cards22,goals2);
        solution(cards13,cards23,goals3);
    }
}
