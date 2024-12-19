package codingtest.programmers.coding.codingLevel1;
/**
 * TITLE : 푸드 파이트 대회
 * LEVEL : 1
 */
public class food_fighting_competition {

    public static String solution(int[] food) {
        String answer = "";
        StringBuilder firstStep = new StringBuilder();
        String water = "0";

        for(int i = 1; i < food.length; i++){
            int foodCnt = food[i] / 2;

            for(int j = 0; j < foodCnt; j++){
                firstStep.append(i);
            }
        }

        StringBuilder red = new StringBuilder(firstStep);
        StringBuilder blue = new StringBuilder(firstStep.reverse());
        answer = red + water + blue;

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,3,4,6};
        int[] arr2 = {1,7,1,2};

        solution(arr1);
        solution(arr2);
    }
}
