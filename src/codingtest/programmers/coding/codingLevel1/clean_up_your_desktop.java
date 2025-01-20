package codingtest.programmers.coding.codingLevel1;
/**
 * TITLE : 바탕화면 정리하기
 * LEVEL : 1
 */
public class clean_up_your_desktop {

    public static int[] solution(String[] wallpaper) {
        int[] answer = {};

        for (int i = 0; i < wallpaper.length; i++) {
            System.out.println(i);
            System.out.println(i + 1);
            String paper = wallpaper[i];
            for (int j = 0; j < paper.length(); j++) {
                if (paper.charAt(j) == '#') {
                    System.out.println(j);
                    System.out.println(j + 1);
                }
            }
            System.out.println();
        }

        return answer;
    }

    public static void main(String[] args) {
//        solution(new String[]{".#...", "..#..", "...#."});
        solution(new String[]{"..........", ".....#....", "......##..", "...##.....", "....#....."});
//        solution(new String[]{".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."});
//        solution(new String[]{"..", "#."});
    }
}
