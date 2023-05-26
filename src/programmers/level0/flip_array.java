package programmers.level0;


/**
 * TITLE : 배열 뒤집기
 * LEVEL : 0
 */
public class flip_array {

    public static int[] solution(int[] num_list){
        int [] answer = new int[num_list.length];

        for(int i = 0; i<answer.length; i++){
            answer[i] = num_list[answer.length -1 - i];
        }

        for(int j=0; j<answer.length; j++){
            System.out.println(answer[j]);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,1,1,1,1,2};
        int[] arr3 = {1,0,1,1,1,3,5};

        solution(arr1);
        solution(arr2);
        solution(arr3);


    }
}
