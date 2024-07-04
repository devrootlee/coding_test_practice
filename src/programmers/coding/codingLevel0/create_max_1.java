package programmers.coding.codingLevel0;

import java.util.Arrays;

/**
 * TITLE : 최대값 만들기(1)
 * LEVEL : 0
 */
public class create_max_1 {

    public static int solution(int[] numbers) {
        int answer = 0;

        // 오름차순으로 정렬
        Arrays.sort(numbers);

        answer = numbers[numbers.length - 2] * numbers[numbers.length - 1];

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {0, 31, 24, 10, 1, 9};

        solution(arr1);
        solution(arr2);
    }
}
