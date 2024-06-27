package programmers.level0;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * TITLE : 겹치는 선분의 길이
 * LEVEL : 0
 */
public class length_of_overlapping_line_segments {

    public static int solution(int[][] lines) {
        int answer = 0;
        List<Integer> list = new ArrayList();

        for(int i = 0; i < lines.length; i++){
            for(int j = lines[i][0]; j < lines[i][1]; j++){
                list.add(j);
            }
        }
        System.out.println(list);

        List<Integer> distinctList = list.stream().distinct().collect(Collectors.toList());

        for(int item : distinctList){
            list.remove((Object)item);
        }

        List<Integer> answerList = list.stream().distinct().collect(Collectors.toList());

        System.out.println(answerList);

        answer = answerList.size();

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[][] intArr1 = {{0,1},{2,5},{3,9}};
        int[][] intArr2 = {{-1,1},{1,3},{3,9}};
        int[][] intArr3 = {{0,5},{3,9},{1,10}};

        solution(intArr1);
        solution(intArr2);
        solution(intArr3);
    }
}
