package programmers.coding.codingLevel1;
/**
 * TITLE : 평균 구하기
 * LEVEL : 1
 */
public class find_the_average {

    public static double solution(int[] arr) {
        double answer;
        int k = 0;

        for(int item : arr){
            k+=item;
        }

        answer = (double) k / arr.length;

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,5};

        solution(arr1);
        solution(arr2);
    }
}
