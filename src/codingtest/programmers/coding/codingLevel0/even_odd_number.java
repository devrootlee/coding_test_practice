package codingtest.programmers.coding.codingLevel0;

/**
 * TITLE : 짝수 홀수 개수
 * LEVEL : 0
 */
public class even_odd_number {
    public static int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int even = 0;
        int odd = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0){
                even++;
            }else {
                odd++;
            }
        }

        answer[0] = even;
        answer[1] = odd;

        System.out.println(answer[0]+" "+answer[1]);
        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 3, 5, 7};

        solution(arr1);
        solution(arr2);
    }
}
