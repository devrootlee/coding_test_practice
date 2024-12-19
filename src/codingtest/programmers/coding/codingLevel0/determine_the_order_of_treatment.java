package codingtest.programmers.coding.codingLevel0;

/**
 * TITLE : 진료 순서 정하기
 * LEVEL : 0
 */
public class determine_the_order_of_treatment {

    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        // 배열 값 비교
        for(int i = 0; i < emergency.length; i++){
            for(int j = 0; j <emergency.length; j++){
                if(emergency[i] < emergency[j]){
                    answer[i]++;
                }
            }
            answer[i]++;
        }

        for(int i = 0; i < emergency.length; i++){
            System.out.print(answer[i]);
        }
        System.out.println();

        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {3,76,24};
        int[] arr2 = {1,2,3,4,5,6,7};
        int[] arr3 = {30,10,23,6,100};


        solution(arr1);
//        solution(arr2);
//        solution(arr3);
    }
}
