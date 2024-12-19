package codingtest.programmers.coding.codingLevel1;


import java.util.*;
/**
 * TITLE : 모의고사
 * LEVEL : 1
 */
public class mock_exam {

    public static int[] solution(int[] answers) {
        int[] answer = {};
        //첫번째 학생
        int[] one = {1, 2, 3, 4, 5};
        //두번째 학생
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        //세번째 학생
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        // 정답개수 배열
        int[] score = new int[3];

        //학생 정답개수 순회
        for (int i = 0; i < answers.length; i++) {
            if (one[i % one.length] == answers[i]) score[0]++;
            if (two[i % two.length] == answers[i]) score[1]++;
            if (three[i % three.length] == answers[i]) score[2]++;
        }

        int max = Math.max(score[0],Math.max(score[1],score[2]));

        List<Integer> answerList = new ArrayList<>();
        if(max == score[0]) answerList.add(1);
        if(max == score[1]) answerList.add(2);
        if(max == score[2]) answerList.add(3);

        answer = answerList.stream().mapToInt(i -> i).toArray();

        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,3,2,4,2};

        solution(arr1);
        solution(arr2);
    }
}
