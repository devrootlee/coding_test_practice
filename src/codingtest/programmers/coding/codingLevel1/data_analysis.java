package codingtest.programmers.coding.codingLevel1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * TITLE : 데이터 분석
 * LEVEL : 1
 */
public class data_analysis {

    public static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};
        List<int[]> list = new ArrayList<>();

        int firstSort = 0;
        switch (ext){
            case "code" : firstSort = 0; break;
            case "date" : firstSort = 1; break;
            case "maximum" : firstSort = 2; break;
            case "remain" : firstSort = 3; break;
        }

        for (int i = 0; i < data.length; i++) {
            if (val_ext >= data[i][firstSort]) {
                list.add(data[i]);
            }
        }

        int secondSort = 0;
        switch (sort_by){
            case "code" : secondSort = 0; break;
            case "date" : secondSort = 1; break;
            case "maximum" : secondSort = 2; break;
            case "remain" : secondSort = 3; break;
        }


        final int secondSortIndex = secondSort;

        list.sort(Comparator.comparingInt(arr -> arr[secondSortIndex]));

        // 결과 리스트를 배열로 변환
        answer = list.toArray(new int[list.size()][]);

        System.out.println(Arrays.toString(answer[0]));
        System.out.println(Arrays.toString(answer[1]));

        return answer;
    }

    public static void main(String[] args) {
        solution(new int[][]{
                {1, 20300104, 100, 80},
                {2, 20300804, 847, 3},
                {3, 20300401, 10, 8}},
                "date",
                20300501,
                "remain");
    }
}
