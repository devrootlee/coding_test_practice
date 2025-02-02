package codingtest.programmers.coding.codingLevel1;

import java.util.Arrays;

public class walk_in_the_park {

    public static int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];

        //스타트 좌표 구하기
        int[] coordinate = new int[2];
        for (int i = 0; i < park.length; i++) {
            String parkCoordinate = park[i];
            if (parkCoordinate.contains("S")) {
                coordinate[0] = i;
            }
            for (int j = 0; j < parkCoordinate.length(); j++) {
                if (parkCoordinate.charAt(j) == 'S') {
                    coordinate[1] = j;
                }
            }
        }

        for (String route : routes) {
            //계산을 위한 좌표
            int x = coordinate[0];
            int y = coordinate[1];

            String compass = route.split(" ")[0];
            int compassValue = Integer.parseInt(route.split(" ")[1]);

            if (compass.equals("E")) {
                for (int i = 0; i < compassValue; i++) {
                    if (park[0].length() < y) {
                        break;
                    }
                    if (park[x].charAt(y) == 'X') {
                        break;
                    }

                    y += 1;
                }

                if (park[0].length() > y) {
                    coordinate[1] = y;
                }

            } else if (compass.equals("W")) {

            } else if (compass.equals("S")) {

            } else if (compass.equals("N")) {

            }
        }

        System.out.println(Arrays.toString(coordinate));

        return answer;
    }

    public static void main(String[] args) {
        solution(new String[]{"SOO","OOO","OOO"}, new String[]{"E 2","S 2","W 1"});
        solution(new String[]{"SOO","OXX","OOO"}, new String[]{"E 2","S 2","W 1"});
        solution(new String[]{"OSO","OOO","OXO","OOO"}, new String[]{"E 2","S 3","W 1"});
    }
}
