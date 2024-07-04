package programmers.coding.codingLevel0;
/**
 * TITLE : 머쓱이보다 키 큰 사람
 * LEVEL : 0
 */
public class a_person_taller_than_a_shy_person {

    public static int solution(int[] array, int height) {
        int answer = 0;

        for(int i=0; i<array.length; i++){
            if(array[i] > height)
                answer++;
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {149,180,192,170};
        int[] arr2 = {180,120,140};

        solution(arr1,167);
        solution(arr2,190);
    }
}
