package programmers.coding.codingLevel2;

import java.util.*;

/**
 * TITLE : 주식 가격
 * LEVEL : 2
 */
public class stock_price {

    public static int[] solution(int[] prices) {
        // 결과 배열 초기화 (모든 요소가 0으로 설정됨)
        int[] answer = new int[prices.length];
        // 가격 인덱스를 담을 스택 초기화
        Stack<Integer> stack = new Stack<>();

        // 가격 배열을 순회
        for (int i = 0; i < prices.length; i++) {
            // 스택이 비어있지 않고, 스택의 맨 위 인덱스의 가격이 현재 가격보다 클 때
            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                int index = stack.pop();
                // 가격이 떨어진 시점까지의 시간을 계산하여 결과 배열에 저장
                answer[index] = i - index;
            }
            // 현재 인덱스를 스택에 추가
            stack.push(i);
        }

        // 스택에 남아있는 인덱스 처리 (끝까지 가격이 떨어지지 않은 경우)
        while (!stack.isEmpty()) {
            int index = stack.pop();
            // 배열의 끝까지 가격이 유지된 시간 저장
            answer[index] = prices.length - 1 - index;
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,2,3};

        solution(arr1);
    }
}
