package programmers.coding.codingLevel0;
/**
 * TITLE : n번째 원소부터
 * LEVEL : 0
 */
public class from_the_nth_element {

    public static int[] solution(int[] num_list, int n){
        int[] answer = new int[num_list.length + 1 - n];

        for(int i = n - 1; i<num_list.length; i++){
            answer[i - n + 1] = num_list[i];
        }

        for(int i = 0; i < answer.length; i++){
            System.out.print(answer[i]);
        }
        System.out.println();



        return answer;
    }

    public static void main(String[] args) {

        int[] arr1 = {2,1,6};
        int[] arr2 = {5,2,1,7,5};

        solution(arr1,3);
        solution(arr2,2);
    }
}
