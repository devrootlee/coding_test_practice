package codingtest.programmers.coding.codingLevel1;
/**
 * TITLE : 행렬의 덧셈
 * LEVEL : 1
 */
public class matrix_addition {

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                System.out.println(answer[i][j]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] arr11 = {{1,2},{2,3}};
        int[][] arr12 = {{1},{2}};
        int[][] arr21 = {{3,4},{5,6}};
        int[][] arr22 = {{3},{4}};

        solution(arr11,arr21);
//        solution(arr12,arr22);
    }
}
