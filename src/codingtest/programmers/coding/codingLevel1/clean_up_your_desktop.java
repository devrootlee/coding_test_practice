package codingtest.programmers.coding.codingLevel1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * TITLE : 바탕화면 정리하기
 * LEVEL : 1
 */
public class clean_up_your_desktop {

    public static int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        List<int[]> coordinate = new ArrayList<>();
        for (int i = 0; i < wallpaper.length; i++) {
            String paper = wallpaper[i];
            for (int j = 0; j < paper.length(); j++) {
                if (paper.charAt(j) == '#') {
                    coordinate.add(new int[]{i, j, i + 1, j + 1});
                }
            }
        }

        int a1 = coordinate.get(0)[0];
        int a2 = coordinate.get(0)[1];
        int b1 = coordinate.get(0)[2];
        int b2 = coordinate.get(0)[3];
        for (int[] item : coordinate) {
            if (a1 > item[0]) {
                a1 = item[0];
            }

            if (a2 > item[1]) {
                a2 = item[1];
            }

            if (b1 < item[2]) {
                b1 = item[2];
            }

            if (b2 < item[3]) {
                b2 = item[3];
            }
        }

        answer[0] = a1;
        answer[1] = a2;
        answer[2] = b1;
        answer[3] = b2;

        System.out.println(Arrays.toString(answer));

        return answer;
    }

    public static void main(String[] args) {
        solution(new String[]{".#...", "..#..", "...#."});
        solution(new String[]{"..........", ".....#....", "......##..", "...##.....", "....#....."});
        solution(new String[]{".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."});
        solution(new String[]{"..", "#."});
    }
}
