package programmers.coding.codingLevel0;
/**
 * TITLE : 홀수 vs 짝수
 * LEVEL : 0
 */
public class odd_vs_even {

    public static int solution(int[] num_list){
        int answer = 0;
        int odd = 0;
        int even = 0;

        for(int i = 0; i<num_list.length; i++){
            if(i%2==1){
                even += num_list[i];
            }else {
                odd += num_list[i];
            }
        }

        if(odd > even){
            answer = odd;
        }else if(odd < even){
            answer = even;
        }else {
            answer = odd;
        }


        System.out.println(answer);


        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {4,2,6,1,7,6};
        int[] arr2 = {-1,2,5,6,3};

        solution(arr1);
        solution(arr2);

    }
}
