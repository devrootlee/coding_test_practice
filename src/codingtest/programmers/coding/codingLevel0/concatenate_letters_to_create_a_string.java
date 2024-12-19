package codingtest.programmers.coding.codingLevel0;
/**
 * TITLE : 글자 이어 붙여 문자열 만들기
 * LEVEL : 0
 */
public class concatenate_letters_to_create_a_string {

    public static String solution(String my_string, int[] index_list){
        String answer = "";

        for(int j = 0; j < index_list.length; j++){

            answer = answer.concat(Character.toString(my_string.charAt(index_list[j])));
        }
        System.out.println(answer);


        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
        int[] arr2 = {1, 2, 0, 0, 3};

        solution("cvsgiorszzzmrpaqpe",arr1);
        solution("zpiaz",arr2);
    }
}
