package codingtest.programmers.coding.codingLevel1;

import java.util.ArrayList;
import java.util.List;

/**
 * TITLE : 크레인 인형뽑기 게임
 * LEVEL : 1
 */
public class crane_claw_game {

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < moves.length; i++) {
            int move = moves[i] - 1;

            for (int j = 0; j < board.length; j++) {
                if (board[j][move] != 0) {
                    list.add(board[j][move]);
                    board[j][move] = 0;
                    break;
                }
            }
        }

        for (int i = list.size() - 1; i > 0; i--) {
            if (list.get(i) == list.get(i - 1)) {
                list.remove(i);
                list.remove(i - 1);
                answer += 2;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(new int[][]{
                {0,0,0,0,0},
                {0,0,1,0,3},
                {0,2,5,0,1},
                {4,2,4,4,2},
                {3,5,1,3,1}
        },new int[]{1,5,3,5,1,2,1,4});
    }
}
