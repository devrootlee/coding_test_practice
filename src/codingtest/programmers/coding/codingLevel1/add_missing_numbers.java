package codingtest.programmers.coding.codingLevel1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * TITLE : 없는 숫자 더하기
 * LEVEL : 1
 */
public class add_missing_numbers {

    public static int solution(int[] numbers) {
        int answer = 0;

        List<Integer> orgnList = new ArrayList<>();
        for (int item : numbers) {
            orgnList.add(item);
        }

        List<Integer> compareList = new ArrayList<>(List.of(0,1,2,3,4,5,6,7,8,9));
        List<Integer> answerList = Stream.concat(
                compareList.stream().filter(item -> !orgnList.contains(item)),
                orgnList.stream().filter(item -> !compareList.contains(item))
        ).collect(Collectors.toList());

        answer += answerList.stream().mapToInt(Integer::intValue).sum();
        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{1,2,3,4,6,7,8,0});
        solution(new int[]{5,8,4,0,6,7,9});
    }
}
