package programmers.level0;
/**
 * TITLE : 1로 만들기
 * LEVEL : 0
 */
public class make_it_1 {
    public static int solution(int[] num_list) {
        int answer = 0;

        for(int i = 0; i < num_list.length; i++){
            int num = num_list[i];

            while(num >= 1){
                if(num == 1){
                    break;
                }else if(num % 2 == 0){
                    num = num / 2;
                    answer++;
                } else if(num % 2 == 1){
                    num = (num-1) / 2;
                    answer++;
                }
            }
        }


        System.out.println(answer);
        return answer;
    }


    public static void main(String[] args) {
        int[] arr = {12,4,15,1,14};

        solution(arr);
    }
    
}
