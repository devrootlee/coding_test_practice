package codingtest.programmers.coding.codingLevel0;

/**
 * TITLE : 조건에 맞게 수열 변환하기 3
 * LEVEL : 0
 */
public class converting_sequences_according_to_conditions_3 {

    public static int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];

        if (k % 2 == 0) {
            for (int i = 0; i < arr.length; i++) {
                answer[i] = arr[i] + k;
            }
        } else if (k % 2 == 1) {
            for (int i = 0; i < arr.length; i++) {
                answer[i] = arr[i] * k;
            }
        }

        for(int item : answer){
            System.out.println(item);
        }
        System.out.println();


        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 100, 99, 98};

        solution(arr1, 3);
        solution(arr1, 2);
    }
}
