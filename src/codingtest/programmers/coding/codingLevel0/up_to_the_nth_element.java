package codingtest.programmers.coding.codingLevel0;
/**
 * TITLE : n번째 원소까지
 * LEVEL : 0
 */
public class up_to_the_nth_element {

    public static int[] solution(int[] num_list, int n){
        int[] answer = new int[n];

        for(int i = 0; i < n; i++){
            answer[i] = num_list[i];

            System.out.print(answer[i]);
        }

        System.out.println();


        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {2,1,6};
        int[] arr2 = {5,2,1,7,5};

        solution(arr1,1);
        solution(arr2,3);
    }
}
