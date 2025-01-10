package codingtest.programmers.coding.codingLevel1;

import java.util.*;

/**
 * TITLE : 햄버거 만들기
 * LEVEL : 1
 */
public class make_hamburger {

    public static int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>(); // 재료 저장 스택

        for (int i : ingredient) {
            stack.push(i); //재료추가

            if (stack.size() >= 4) {
                int stackSize = stack.size();
                if (stack.get(stackSize - 4) == 1 &&
                        stack.get(stackSize - 3) == 2 &&
                        stack.get(stackSize - 2) == 3 &&
                        stack.get(stackSize - 1) == 1) {

                    // 햄버거 만들 수 있으면 제거
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();

                    answer++; // 햄버거 개수 증가
                }
            }
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1});
        solution(new int[]{1, 3, 2, 1, 2, 1, 3, 1, 2});
    }
}
