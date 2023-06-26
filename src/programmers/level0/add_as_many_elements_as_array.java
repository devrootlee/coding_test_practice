package programmers.level0;

/**
 * TITLE : 배열의 원소만큼 추가하기
 * LEVEL : 0
 */
public class add_as_many_elements_as_array {

    public static int[] solution(int[] arr) {
        int[] answer = {};
        int length = 0;

        for(int i =0; i<arr.length; i++){
            length += arr[i];
        }

        answer = new int[length];

        int idx = 0;

      for(int i = 0; i<arr.length; i++){
          for(int j =0; j<arr[i]; j++){
              answer[idx++] = arr[i];

              System.out.println(answer[j]);
          }
      }



        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {5,1,4};
        int[] arr2 = {6,6};
        int[] arr3 = {1};

        solution(arr1);
        solution(arr2);
        solution(arr3);

    }
}
