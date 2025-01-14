package codingtest.programmers.coding.codingLevel1;

import java.util.*;

/**
 * TITLE : 키패드 누르기
 * LEVEL : 1
 */
public class pressing_the_keypad {
    public static int calculateManhattanDistance(int[] a, int[] b) {
        return Math.abs(b[0] - a[0]) + Math.abs(b[1] - a[1]);
    }

    public static String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();

        Map<String,int[]> phones = new HashMap<>();
        phones.put("1",new int[]{0,0});
        phones.put("2",new int[]{0,1});
        phones.put("3",new int[]{0,2});
        phones.put("4",new int[]{1,0});
        phones.put("5",new int[]{1,1});
        phones.put("6",new int[]{1,2});
        phones.put("7",new int[]{2,0});
        phones.put("8",new int[]{2,1});
        phones.put("9",new int[]{2,2});
        phones.put("*",new int[]{3,0});
        phones.put("0",new int[]{3,1});
        phones.put("#",new int[]{3,2});

        // 현재 손의 위치
        String leftCurrent = "*";
        String rightCurrent = "#";

        for (int number : numbers) {
            String target = String.valueOf(number);

            if (Arrays.asList("1", "4", "7").contains(target)) {
                answer.append("L");
                leftCurrent = target;
            } else if (Arrays.asList("3", "6", "9").contains(target)) {
                answer.append("R");
                rightCurrent = target;
            } else {
                // 거리 계산
                int leftDistance = calculateManhattanDistance(phones.get(leftCurrent), phones.get(target));
                int rightDistance = calculateManhattanDistance(phones.get(rightCurrent), phones.get(target));

                if (leftDistance == rightDistance) {
                    if (hand.equals("right")) {
                        answer.append("R");
                        rightCurrent = target;
                    } else {
                        answer.append("L");
                        leftCurrent = target;
                    }
                } else if (leftDistance < rightDistance) {
                    answer.append("L");
                    leftCurrent = target;
                } else {
                    answer.append("R");
                    rightCurrent = target;
                }
            }
        }

        System.out.println(answer);

        return answer.toString();
    }

    public static void main(String[] args) {
        solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right");
        solution(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left");
        solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, "right");
        solution(new int[]{0, 5, 8, 2}, "left");
    }
}
