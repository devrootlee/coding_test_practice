package codingtest.programmers.coding.codingLevel0;

/**
 * TITLE : n개 간격의 원소들
 * LEVEL : 0
 */
public class elements_in_n_intervals {

    public static int[] solution(int[] num_list, int n) {
        int[] answer = {};

        for(int i = 0; i < num_list.length; i++){
            if(i * n < num_list.length){
                answer = new int[i + 1];
            }
        }

        for(int i = 0; i < answer.length; i++){
            answer[i] = num_list[i * n];

            System.out.print(answer[i]);
        }
        System.out.println();

        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 2, 6, 1, 7, 6};
        solution(arr1, 2);
        solution(arr1, 4);
        solution(arr1, 6);

    }
}
