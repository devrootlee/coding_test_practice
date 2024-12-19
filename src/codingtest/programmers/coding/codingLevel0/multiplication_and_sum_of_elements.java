package codingtest.programmers.coding.codingLevel0;
/**
 * TITLE : 원소들의 곱과 합
 * LEVEL : 0
 */
public class multiplication_and_sum_of_elements {

    public static int solution(int[] num_list){
        int answer = 0;
        int sum = 0;
        int multiplication = 1;

        for(int i = 0; i < num_list.length; i++){
            sum += num_list[i];
            multiplication *= num_list[i];
        }
        sum = sum*sum;

        if(sum > multiplication){
            answer = 1;
        }else{
            answer = 0;
        }


        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {3,4,5,2,1};
        int[] arr2 = {5,7,8,3};

        solution(arr1);
        solution(arr2);
    }
}
