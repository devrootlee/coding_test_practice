package codingtest.programmers.coding.codingLevel1;

/**
 * TITLE : 이웃한 칸
 * LEVEL : 1
 */
public class neighboring_khan {

    public static int solution(String[][] board, int h, int w) {
        int answer = 0;

    String color = board[h][w]; // board[h][w]의 색

    // 상, 하, 좌, 우
    int [][] directions = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};

        // directions 순회 (상 -> 하 -> 좌 -> 우)
        for (int[] dir : directions) {

            // 이동할 인덱스 생성
            int mov_h = h + dir[0];
            int mov_w = w + dir[1];

            // 이동한 인덱스가 유효할 시
            if ((mov_h >= 0) && (mov_h < board.length) && (mov_w >= 0) && (mov_w < board[0].length)) {

                // 이동한 칸의 색과 board[h][w]의 색이 같을 시 count += 1
                if (color.equals(board[mov_h][mov_w])) {
                    answer += 1;
                }
            }
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution(new String[][]{{"blue", "red", "orange", "red"},{"red", "red", "blue", "orange"},{"blue", "orange", "red", "red"},{"orange", "orange", "red", "blue"}},1,1);
        solution(new String[][]{{"yellow", "green", "blue"},{"blue", "green", "yellow"},{"yellow", "blue", "blue"}},0,1);
    }
}
