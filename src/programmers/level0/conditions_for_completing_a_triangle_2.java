package programmers.level0;

import java.util.Arrays;

/**
 * TITLE : 삼각형의 완성조건(2)
 * LEVEL : 0
 */
public class conditions_for_completing_a_triangle_2 {

    public static int solution(int[] sides) {
        int answer = 0;

        Arrays.sort(sides);

        // 제일 긴 변이 배열에 있을 시
        for(int i = sides[1] - sides[0] + 1 ; i <= sides[1]; i++){
            answer++;
        }

        // 제일 긴 변이 배열에 없을 시
        for(int i = sides[1]; i < sides[0] + sides[1] - 1; i++){
            answer++;
        }
        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        int[] intArr1 = {1,2};
        int[] intArr2 = {3,6};
        int[] intArr3 = {11,7};

        solution(intArr1);
        solution(intArr2);
        solution(intArr3);
    }
}
