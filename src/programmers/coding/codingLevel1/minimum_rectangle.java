package programmers.coding.codingLevel1;

/**
 * TITLE : 최소직사각형
 * LEVEL : 1
 */
public class minimum_rectangle {

    public static int solution(int[][] sizes) {
        int answer = 0;

        int maxWidth = 0;
        int maxHeight = 0;

        for(int[] size : sizes){
            int w = Math.max(size[0],size[1]);
            int h = Math.min(size[0],size[1]);

            maxWidth = Math.max(maxWidth, w);
            maxHeight = Math.max(maxHeight, h);
        }


        answer = maxWidth * maxHeight;
        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{60,50},{30,70},{60,30},{80,40}};
        int[][] arr2 = {{10,7},{12,3},{8,15},{14,7},{5,15}};
        int[][] arr3 = {{14,4},{19,6},{6,16},{18,7},{7,11}};

        solution(arr1);
        solution(arr2);
        solution(arr3);
    }
}
