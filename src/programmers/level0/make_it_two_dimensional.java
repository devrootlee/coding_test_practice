package programmers.level0;
/**
 * TITLE : 2차원으로 만들기
 * LEVEL : 0
 */
public class make_it_two_dimensional {

    public static int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int k = 0;
        for(int i = 0; i < num_list.length/n; i++){
            for(int j = 0; j <n; j++){
                answer[i][j] = num_list[k];
                k++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] num_list1 = {1,2,3,4,5,6,7,8};

        solution(num_list1,2);
    }
}
