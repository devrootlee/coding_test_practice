package codingtest.programmers.coding.codingLevel1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class failure_rate {

    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        List<Integer> stagesList = new ArrayList<>();
        List<double[]> indexList = new ArrayList<>();
        for (int item : stages) {
            stagesList.add(item);
        }

        for (int i = 1; i <= N; i++) {
            int playerCnt = stagesList.size();
            int failPlayerCnt = 0;
            for (int j = stagesList.size() - 1; j >= 0; j--) {
                if (i >= stagesList.get(j)) {
                    failPlayerCnt++;
                    stagesList.remove(j);
                }
            }
            if (Double.isNaN((double) failPlayerCnt / playerCnt)) {
                indexList.add(new double[]{i, -1.0});
            } else {
                indexList.add(new double[]{i, (double) failPlayerCnt / playerCnt});
            }
        }

        for(double[] item : indexList) {
            System.out.println(Arrays.toString(item));
        }

        indexList.sort((a, b) -> Double.compare(b[1], a[1]));

        for (int i = 0; i < answer.length; i++) {
            answer[i] = (int) indexList.get(i)[0];
        }

        System.out.println(Arrays.toString(answer));

        return answer;
    }

    public static void main(String[] args) {
//        solution(5,new int[]{2, 1, 2, 6, 2, 4, 3, 3});
//        solution(4,new int[]{4,4,4,4,4});
        solution(6, new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2});
    }
}