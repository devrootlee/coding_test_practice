package programmers.coding.codingLevel0;
/**
 * TITLE : 정수를 나선형으로 배치하기
 * LEVEL : 0
 */
public class arrange_integers_in_a_spiral {
    static int[][] answer;
    public static int[][] solution(int n) {
        answer =new int[n][n];
        fill(0,0,1,n);

        for(int i = 0; i < answer.length; i++){
            for(int j = 0; j < answer.length; j++){
                System.out.println(answer[i][j]);
            }
        }
        return answer;
    }

    static void fill(int y,int x,int num,int n) {
        if(n<=0) return;
        answer[y][x]=num;
        for(int i=1;i<n;i++) answer[y][++x]=++num;
        for(int i=1;i<n;i++) answer[++y][x]=++num;
        for(int i=1;i<n;i++) answer[y][--x]=++num;
        for(int i=1;i<n-1;i++) answer[--y][x]=++num;
        fill(y,x+1,num+1,n-2);
    }

    public static void main(String[] args) {
        solution(4);
        solution(5);
    }
}
