package programmers.level0;
/**
 * TITLE : 이어 붙인 수
 * LEVEL : 0
 */
public class number_of_concatenations {

    public static int solution(int[] num_list){
        int answer = 0;
        String even = "";
        String odd = "";

        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 1){
                even = even.concat(Integer.toString(num_list[i]));
            }else{
                odd = odd.concat(Integer.toString(num_list[i]));
            }
        }
        answer = Integer.parseInt(even) + Integer.parseInt(odd);

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
