package codingtest.programmers.coding.codingLevel2;

import java.util.Arrays;
import java.util.Comparator;
/**
 * TITLE : 가장 큰 수
 * LEVEL : 2
 */
public class biggest_number {

    public static String solution(int[] numbers) {

        // 문자열 비교를 위한 Comparator를 별도로 정의
        Comparator<String> customComparator = new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                // 두 문자열을 서로 이어붙인 결과를 비교하여 내림차순 정렬
                return (b + a).compareTo(a + b);
            }
        };

        // 숫자 배열을 문자열 배열로 변환
        String[] strNumbers = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        // 미리 정의된 customComparator를 사용해 배열을 정렬
        Arrays.sort(strNumbers, customComparator);

        // 정렬된 문자열 배열을 하나의 문자열로 결합
        String answer = String.join("", strNumbers);

        // 모든 숫자가 0인 경우 처리 (예: [0, 0, 0])
        if (answer.startsWith("0")) {
            return "0";
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {6,10,2};
        int[] arr2 = {3,30,34,5,9};

        System.out.println(solution(arr1));
        System.out.println(solution(arr2));
    }
}
