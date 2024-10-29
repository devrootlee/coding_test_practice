package programmers.coding.codingLevel2;

import java.util.Arrays;

/**
 * TITLE : 카펫
 * LEVEL : 2
 */
public class carpet {

    public static int[] solution(int brown, int yellow) {
        int[] answer = {};

        //카펫 크기
        int area = brown + yellow;

        int w;
        int h = 3;

        while(true){
            if (area % h != 0){
                h++;
                continue;
            }

            w = area / h;

            if ((w-2) * (h-2) == yellow) {

                answer = new int[] {w,h};

                System.out.println(Arrays.toString(answer));

                return answer;
            }
            h++;
        }
    }

    public static void main(String[] args) {
        solution(10,2);
        solution(8,1);
        solution(24,24);
    }
}
