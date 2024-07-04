package programmers.coding.codingLevel0;

/**
 * TITLE : 평행
 * LEVEL : 0
 */
public class parallel {

    public static int solution(int[][] dots) {
        int answer = 0;

        int x1 = dots[0][0];
        int y1 = dots[0][1];
        int x2 = dots[1][0];
        int y2 = dots[1][1];
        int x3 = dots[2][0];
        int y3 = dots[2][1];
        int x4 = dots[3][0];
        int y4 = dots[3][1];

        double slope1 = (double) (y2 - y1) / (x2 - x1);
        double slope2 = (double) (y4 - y3) / (x4 - x3);
        if (slope1 == slope2) answer = 1;

        slope1 = (double) (y3 - y1) / (x3 - x1);
        slope2 = (double) (y2 - y4) / (x2 - x4);
        if (slope1 == slope2) answer = 1;

        slope1 = (double) (y4 - y1) / (x4 - x1);
        slope2 = (double) (y2 - y3) / (x2 - x3);
        if (slope1 == slope2) answer = 1;


        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        int[][] dots1 = {{1,4},{9,2},{3,8},{11,6}};
        int[][] dots2 = {{3,5},{4,1},{2,4},{5,10}};
        int[][] dots3 = {{1,2},{2,1},{3,4},{4,5}};
        int[][] dots4 = {{1,2},{5,1},{3,6},{6,3}};

        solution(dots1);
        solution(dots2);
        solution(dots3);
        solution(dots4);
    }
}
