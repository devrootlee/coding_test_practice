package codingtest.programmers.coding.codingLevel0;

/**
 * TITLE : 정수 찾기
 * LEVEL : 0
 */
public class find_integer {

    public static int solution(int[] num_list, int n) {
        int answer = 0;



        for (int i = 0; i < num_list.length; i++) {

            if (num_list[i] == n) {
                answer ++;
                if(answer != 1){
                    answer = 1;
                }
            }
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {15, 98, 23, 2, 15};

        solution(arr1, 3);
        solution(arr2, 15);
    }
}
