package programmers.level0;
/**
 * TITLE : 특별한 이차원 배열 1
 * LEVEL : 0
 */
public class special_two_dimensional_array1 {
    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j){
                    answer[i][j] = 1;
                }else {
                    answer[i][j] = 0;
                }

                System.out.println(answer[i][j]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
//        solution(3);
//        solution(6);
        solution(1);
    }
}
