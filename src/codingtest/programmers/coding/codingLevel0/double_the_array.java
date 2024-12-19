package codingtest.programmers.coding.codingLevel0;
/**
 * TITLE : 배열 두 배 만들기
 * LEVEL : 0
 */
public class double_the_array {

    public static int[] solution(int[] numbers){
        int[] answer = new int[numbers.length];

        for(int i = 0; i < answer.length; i++){
            answer[i] = numbers[i] * 2;
        }

        for(int i = 0; i < answer.length; i++){
            System.out.println(answer[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,100,-99,1,2,3};

        solution(arr1);
        solution(arr2);
    }
}
