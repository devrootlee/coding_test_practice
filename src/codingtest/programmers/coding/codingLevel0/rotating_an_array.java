package codingtest.programmers.coding.codingLevel0;
/**
 * TITLE : 배열 회전시키기
 * LEVEL : 0
 */
public class rotating_an_array {

    public static int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        for(int i = 0; i < numbers.length; i++){
            if(direction.equals("right")){
                if(i == 0){
                    answer[i] = numbers[Math.abs(0 - (numbers.length-1))];
                }else {
                    answer[i] = numbers[i - 1];
                }
            }else{
                if(i == numbers.length - 1){
                    answer[i] = numbers[0];
                }else {
                    answer[i] = numbers[i + 1];
                }
            }
        }

        for(int i = 0; i < answer.length; i++){
            System.out.print(answer[i]+ ",");
        }
        System.out.println();

        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,455,6,4,-1,45,6};

        solution(arr1,"right");
        solution(arr2,"left");
    }
}
