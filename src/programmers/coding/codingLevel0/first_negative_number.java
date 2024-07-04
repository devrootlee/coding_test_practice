package programmers.coding.codingLevel0;
/**
 * TITLE : 첫 번째로 나오는 음수
 * LEVEL : 0
 */
public class first_negative_number {

    public static int solution(int[] num_list) {
        int answer = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                answer = i;
                break;
            }
            answer = -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {12, 4, 15, 46, 38, -2, 15};
        int[] arr2 = {13, 22, 53, 24, 15, 6};

        solution(arr1);
        solution(arr2);
    }
}
