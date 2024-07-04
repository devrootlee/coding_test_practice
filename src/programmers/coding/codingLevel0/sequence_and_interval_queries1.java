package programmers.coding.codingLevel0;
/**
 * TITLE : 수열과 구간 쿼리1
 * LEVEL : 0
 */
public class sequence_and_interval_queries1 {

    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];

        for(int i = 0; i < queries.length; i++){
            int start = queries[i][0];
            int end = queries[i][1];

            for(int j = start; j <= end; j++){
                arr[j] = arr[j] + 1;
            }
        }


        for(int i = 0; i < answer.length; i++){
            answer[i] = arr[i];
            System.out.println(answer[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {0,1,2,3,4};
        int[][] queries1 = {{0,1},{1,2},{2,3}};

        solution(arr1,queries1);
    }
}
