package programmers.coding.codingLevel0;
/**
 * TITLE : 길이에 따른 연산
 * LEVEL : 0
 */
public class operation_along_the_length {

    public static int solution(int[] num_list){
        int answer = 0;

        if(num_list.length >= 11){
            for(int i : num_list){
                answer += i;
            }
        }else if(num_list.length <= 10){
            answer = answer + 1;
            for(int i : num_list){
                answer *= i;
            }
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {3,4,5,2,5,4,6,7,3,7,2,2,1};
        int[] arr2 = {2,3,4,5};

        solution(arr1);
        solution(arr2);
    }
}
