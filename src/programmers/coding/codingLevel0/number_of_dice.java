package programmers.coding.codingLevel0;
/**
 * TITLE : 주사위의 개수
 * LEVEL : 0
 */
public class number_of_dice {

    public static int solution(int[] box, int n){
        int answer = 1;

        for(int i =0; i<box.length; i++){
            answer *= box[i]/n;
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,1,1};
        int[] arr2 = {10,8,6};

        solution(arr1,1);
        solution(arr2,3);
    }
}
