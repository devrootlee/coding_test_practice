package codingtest.programmers.coding.codingLevel1;

import java.util.Arrays;
/**
 * TITLE : 공원 산책
 * LEVEL : 1
 */
public class walk_in_the_park {

    public static int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];

        //시작 좌표 구하기
        for (int i = 0; i < park.length; i++) {
            String coordinate = park[i];
            if (coordinate.contains("S")) {
                answer[0] = i;
            }

            for (int j = 0; j < coordinate.length(); j++) {
                if (coordinate.charAt(j) == 'S') {
                    answer[1] = j;
                }
            }
        }

        //이동 시작
        for (String route : routes) {
            //동서남북
            String direction = route.split(" ")[0];
            //동서남북 이동값
            int directionValue = Integer.parseInt(route.split(" ")[1]);
            
            //시작 좌표 초기값 저장
            int x = 0;
            int y = 0;

            //동쪽
            if (direction.equals("E")) {
                x = answer[0];
                y = answer[1];
                for (int i = 0; i < directionValue; i++) {
                    y++;
                    //y를 1만큼 옮겼을 때 공원 크기 보다 크면 멈추기
                    if (y > park[0].length() - 1) {
                        y = answer[1];
                        break;
                    }

                    if (park[x].charAt(y) == 'X') {
                        y = answer[1];
                        break;
                    }
                }
                answer[1] = y;
            } else if (direction.equals("W")) { //서쪽
                x = answer[0];
                y = answer[1];
                for (int i = 0; i < directionValue; i++) {
                    y--;

                    if (y < 0) {
                        y = answer[1];
                        break;
                    }

                    if (park[x].charAt(y) == 'X') {
                        y = answer[1];
                        break;
                    }
                }
                answer[1] = y;
            } else if (direction.equals("S")) { //남쪽
                x = answer[0];
                y = answer[1];
                for (int i = 0; i < directionValue; i++) {
                    x++;

                    if (x > park.length - 1) {
                        x = answer[0];
                        break;
                    }

                    if (park[x].charAt(y) == 'X') {
                        x = answer[0];
                        break;
                    }
                }
                answer[0] = x;
            } else if (direction.equals("N")) { //북쪽
                x = answer[0];
                y = answer[1];

                for (int i = 0; i < directionValue; i++) {
                    x--;

                    if (x < 0) {
                        x = answer[0];
                        break;
                    }

                    if(park[x].charAt(y) == 'X') {
                        x = answer[0];
                        break;
                    }
                }
                answer[0] = x;
            }
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        solution(new String[]{"SOO","OOO","OOO"}, new String[]{"E 2","S 2", "W 1"});
        solution(new String[]{"SOO","OXX","OOO"}, new String[]{"E 2","S 2","W 1"});
        solution(new String[]{"OSO","OOO","OXO","OOO"}, new String[]{"E 2","S 3","W 1"});
    }
}
