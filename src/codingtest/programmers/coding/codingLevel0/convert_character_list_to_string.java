package codingtest.programmers.coding.codingLevel0;
/**
 * TITLE : 문자 리스트를 문자열로 변환하기
 * LEVEL : 0
 */
public class convert_character_list_to_string {

    public static String solution(String[] arr){
        String answer = "";

        for(int i = 0; i < arr.length; i++){
            answer += arr[i];
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        String[] arr1 = {"a","b","c"};

        solution(arr1);
    }
}
