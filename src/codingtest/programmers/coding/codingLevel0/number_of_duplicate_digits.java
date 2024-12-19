package codingtest.programmers.coding.codingLevel0;
/**
 * TITLE : 중복된 숫자 개수
 * LEVEL : 0
 */
public class number_of_duplicate_digits {

    public static int solution(int[] array, int n) {
        int answer = 0;

        for(int i=0; i<array.length; i++){
            if(array[i] == n)
                answer++;
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3,4,5};
        int[] arr2 = {0,2,3,4};

        solution(arr1,1);
        solution(arr2,1);
    }
}
