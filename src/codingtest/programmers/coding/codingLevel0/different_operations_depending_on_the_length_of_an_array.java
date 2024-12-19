package codingtest.programmers.coding.codingLevel0;
/**
 * TITLE : 배열의 길이에 따라 다른 연산하기
 * LEVEL : 0
 */
public class different_operations_depending_on_the_length_of_an_array {

    public static int[] solution(int[] arr, int n){
        int[] answer = new int[arr.length];

        if(arr.length % 2 == 1){
            for(int i = 0; i < arr.length; i++){
                if(i % 2 == 0){
                    answer[i] = arr[i] + n;
                }else {
                    answer[i] = arr[i];
                }

                System.out.println(answer[i]);
            }
        }else {
            for(int i = 0; i < arr.length; i++){
                if(i % 2 == 1){
                    answer[i] = arr[i] + n;
                }else {
                    answer[i] = arr[i];
                }

                System.out.println(answer[i]);
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {49,12,100,276,33};
        int[] arr2 = {444,555,666,777};

        solution(arr1,27);
        solution(arr2,100);
    }
}
