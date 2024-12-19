package codingtest.programmers.coding.codingLevel0;

/**
 * TITLE : n보다 커질 때까지 더하기
 * LEVEL : 0
 */
public class add_until_greater_than_n {

    public static int solution(int[] numbers, int n) {
        int answer = 0;

        for(int i = 0; i < numbers.length; i++){
            answer+=numbers[i];

            if(answer > n){
                break;
            }
        }


        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {34, 5, 71, 29, 100, 34};
        int[] arr2 = {58, 44, 27, 10, 100};

        solution(arr1,123);
        solution(arr2,139);
    }
}
