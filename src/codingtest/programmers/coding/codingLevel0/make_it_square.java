package codingtest.programmers.coding.codingLevel0;
/**
 * TITLE : 정사각형으로 만들기
 * LEVEL : 0
 */
public class make_it_square {
    public static int[][] solution(int[][] arr) {
        int[][] answer = {};

        if(arr.length > arr[0].length){
            answer = new int[arr.length][arr.length];

            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr[0].length; j++){
                    answer[i][j] = arr[i][j];
                }
            }

        }else if (arr.length < arr[0].length) {
            answer = new int[arr[0].length][arr[0].length];

            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr[0].length; j++){
                    answer[i][j] = arr[i][j];
                }
            }

        } else {
            answer = new int[arr.length][arr[0].length];

            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr[0].length; j++){
                    answer[i][j] = arr[i][j];
                }
            }
        }

        for(int i = 0; i < answer.length; i++){
            for(int j = 0; j < answer.length; j++){
                System.out.println(answer[i][j]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}};
        int[][] arr2 = {{57, 192, 534, 2}, {9, 345, 192, 999}};
        int[][] arr3 = {{1, 2}, {3, 4}};

        solution(arr1);
        solution(arr2);
        solution(arr3);
    }
}
