package codingtest.programmers.coding.codingLevel0;

/**
 * TITLE : 안전지대
 * LEVEL : 0
 */
public class safe_zone {

    public static int solution(int[][] board) {
        int answer = 0;

        int[][] newBoard = new int[board.length][board.length];

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == 1){
                    int row = i;
                    int column = j;

                    int changeRowSt = (row == 0) ? row : i - 1;
                    int changeRowEd = (row == board.length - 1) ? row : i + 1;
                    int changeColumnSt = (column == 0) ? column : j - 1;
                    int changeColumnEd = (column == board.length - 1) ? column : j + 1;


                    for(int m = changeRowSt; m <= changeRowEd; m++){
                        for(int n = changeColumnSt; n <= changeColumnEd; n++){
                            newBoard[m][n] = 1;
                        }
                    }
                }else {

                }
            }
        }

        System.out.println("기존 보드");
        for(int i = 0; i < newBoard.length; i++){
            int j = newBoard[i].length;

            for(int k = 0; k < j; k++){
                System.out.print(board[i][k]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("새로운 보드");
        for(int i = 0; i < newBoard.length; i++){
            int j = newBoard[i].length;

            for(int k = 0; k < j; k++){
                System.out.print(newBoard[i][k]);

                if(newBoard[i][k] == 0){
                    answer++;
                }
            }
            System.out.println();
        }

        System.out.println(answer);
        return answer;
    }


    public static void main(String[] args) {
        int[][] intArr1 = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
        int[][] intArr2 = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}};
        int[][] intArr3 = {{1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}};

        solution(intArr1);
        solution(intArr2);
        solution(intArr3);
    }
}
