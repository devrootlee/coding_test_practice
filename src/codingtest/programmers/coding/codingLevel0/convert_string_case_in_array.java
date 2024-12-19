package codingtest.programmers.coding.codingLevel0;
/**
 * TITLE : 배열에서 문자열 대소문자 변환하기
 * LEVEL : 0
 */
public class convert_string_case_in_array {

    public static String[] solution(String[] strArr){
        String[] answer = new String[strArr.length];

        for(int i = 0; i<strArr.length; i++){
            if(i % 2 == 0){
                answer[i] = strArr[i].toLowerCase();
            }else {
                answer[i] = strArr[i].toUpperCase();
            }

            System.out.println(answer[i]);
        }


        return answer;
    }

    public static void main(String[] args) {
        String[] arr1 = {"AAA","BBB","CCC","DDD"};
        String[] arr2 = {"aBc","AbC"};

        solution(arr1);
        solution(arr2);
    }
}
