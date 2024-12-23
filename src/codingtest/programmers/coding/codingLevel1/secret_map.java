package codingtest.programmers.coding.codingLevel1;

import java.util.Arrays;

/**
 * TITLE : [1차] 비밀지도
 * LEVEL : 1
 */
public class secret_map {

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < arr1.length; i++) {
            int binary = arr1[i] | arr2[i];
            String binaryString = Integer.toBinaryString(binary);

            //앞에 0 추가
            while (binaryString.length() < n) {
                binaryString = "0" + binaryString;
            }
            int binaryStringLength = binaryString.length();
            String map = "";
            for (int j = 0; j < binaryStringLength; j++) {
                if (binaryString.charAt(j) == '1') {
                    map += "#";
                } else {
                    map += " ";
                }
                answer[i] = map;
            }
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
//        solution(	5,new int[]{9, 20, 28, 18, 11},new int[]{30, 1, 21, 17, 28});
        solution(6,new int[]{46, 33, 33 ,22, 31, 50},new int[]{27 ,56, 19, 14, 14, 10});
    }
}
