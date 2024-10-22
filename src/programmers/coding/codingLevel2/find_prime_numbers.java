package programmers.coding.codingLevel2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * TITLE : 소수 찾기
 * LEVEL : 2
 */
public class find_prime_numbers {

    public static Set subSolution(String current, String numbers, Set<String> combinations){
        Set<String> subAnswer = new HashSet<>();

        if (!current.isEmpty()) {
            if (current.charAt(0) != '0'){
                combinations.add(current);  // 현재 조합을 추가
            }
        }

        for (int i = 0; i < numbers.length(); i++) {
            // 현재 문자 사용 여부 확인
            String next = current + numbers.charAt(i);
            String remaining = numbers.substring(0, i) + numbers.substring(i + 1); // 현재 문자를 제외한 나머지

            subSolution(next, remaining, combinations);  // 재귀 호출
        }


        subAnswer = combinations;

        return subAnswer;
    }

    public static int solution(String numbers) {
        int answer = 0;

        Set<String> combinations = new HashSet<>();
        combinations = subSolution("", numbers, combinations);
        List<String> list = new ArrayList<>(combinations);
        list.remove("1");


        for(int i = 0; i < list.size(); i++){
            int j = Integer.parseInt(list.get(i));
            int cnt = 0;

            for(int k = 2; k <= j; k++){
                if (j % k == 0){
                    cnt++;
                }
            }

            if(cnt == 1){
                answer++;
            }
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution("17");
        solution("011");
    }
}
