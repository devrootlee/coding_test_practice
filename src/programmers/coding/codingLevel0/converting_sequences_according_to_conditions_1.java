package programmers.coding.codingLevel0;
/**
 * TITLE : 조건에 맞게 수열 변환하기 1
 * LEVEL : 0
 */
public class converting_sequences_according_to_conditions_1 {

    public static int[] solution(int[] arr){
        int[] answer = {};

        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 50 && arr[i] % 2 == 0){
                arr[i] = arr[i] / 2;
            }else if(arr[i] < 50 && arr[i] % 2 == 1){
                arr[i] = arr[i] * 2;
            }
        }

        answer = arr.clone();


        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,100,99,98};

        solution(arr1);
    }
}
