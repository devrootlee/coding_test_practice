package codingtest.programmers.coding.codingLevel0;
/**
 * TITLE : 7의 개수
 * LEVEL : 0
 */
public class number_of_7 {

    public static int solution(int[] array) {
        int answer = 0;

        for(int i = 0; i <array.length; i++){
            String item = String.valueOf(array[i]);

            for(int j = 0; j < item.length(); j++){

                if(item.charAt(j) == '7'){
                    answer++;
                }
            }
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {7,77,17};
        int[] arr2 = {10,29};

        solution(arr1);
        solution(arr2);
    }
}
