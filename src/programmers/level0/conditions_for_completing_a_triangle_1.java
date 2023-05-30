package programmers.level0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * TITLE : 삼각형의 완성조건(1)
 * LEVEL : 0
 */
public class conditions_for_completing_a_triangle_1 {

    public static int solution(int[] sides) {
        int answer = 0;
        List<Integer> convertList = new ArrayList();

        // 배열을 리스트에 삽입
        for (int i = 0; i < sides.length; i++) {
            convertList.add(sides[i]);
        }

        // 제일 긴 변 찾기
        int longSide = (int) Collections.max(convertList);


        // 제일 긴 변 제거
        convertList.remove(Integer.valueOf(longSide));


        // 다른 변의 합
        int otherSideSum = convertList.stream().mapToInt(Integer::intValue).sum();


        if (longSide > otherSideSum) {
            answer = 2;
        } else if (longSide == otherSideSum) {
            answer = 2;
        } else if (longSide < otherSideSum) {
            answer = 1;
        }


        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {3, 6, 2};
        int[] arr3 = {199, 72, 222};

        solution(arr1);
        solution(arr2);
        solution(arr3);
    }
}
