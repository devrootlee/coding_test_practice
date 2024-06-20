package programmers.level0;
/**
 * TITLE : 직사각형 넓이 구하기
 * LEVEL : 0
 */
public class find_the_area_of_a_rectangle {
    public static int solution(int[][] dots) {
        int answer = 0;

        int width = 0;
        int minWidth = dots[0][0];
        int maxWidth = dots[0][0];

        int height = 0;
        int maxHeight = dots[0][1];
        int minHeight = dots[0][1];

        // width
        for(int i = 0; i <dots.length; i++){

            if(maxWidth <= dots[i][0]){
                maxWidth = dots[i][0];
            }

            if(minWidth >= dots[i][0]){
                minWidth = dots[i][0];
            }
        }
        width = maxWidth - minWidth;

        // height
        for(int i = 0; i <dots.length; i++){

            if(maxHeight <= dots[i][1]){
                maxHeight = dots[i][1];
            }

            if(minHeight >= dots[i][1]){
                minHeight = dots[i][1];
            }
        }
        height = maxHeight - minHeight;


        answer = width * height;

        return answer;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{1,1},{2,1},{2,2},{1,2}};
        int[][] arr2 = {{-1,-1},{1,1},{1,-1},{-1,1}};

        solution(arr1);
        solution(arr2);
    }
}
