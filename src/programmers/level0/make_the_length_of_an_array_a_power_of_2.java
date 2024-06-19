package programmers.level0;
/**
 * TITLE : 배열의 길이를 2의 거듭제곱으로 만들기
 * LEVEL : 0
 */
public class make_the_length_of_an_array_a_power_of_2 {

    public static int[] solution(int[] arr) {
        int[] answer = {};

        int jegob = 1;

        while(arr.length > jegob){
            jegob = jegob * 2;
        }

        answer = new int[jegob];

        for(int i = 0; i< answer.length; i++){

            if(i >= arr.length){
                answer[i] = 0;
            }else {
                answer[i] = arr[i];
            }

        }


        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {58,172,746,89};

        solution(arr1);
        solution(arr2);

    }
}
