package programmers.coding.codingLevel0;
/**
 * TITLE : 이차원 배열 대각선 순회하기
 * LEVEL : 0
 */
public class traversing_a_two_dimensional_array_diagonally {

    public static int solution(int[][] board, int k) {
        int answer = 0;

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(i + j <= k){
                    answer += board[i][j];
                }
            }
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{0,1,2},{1,2,3},{2,3,4},{3,4,5}};

        solution(arr1,2);
    }
}
