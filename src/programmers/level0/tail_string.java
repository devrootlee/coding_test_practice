package programmers.level0;
/**
 * TITLE : 꼬리 문자열
 * LEVEL : 0
 */
public class tail_string {

    public static String solution(String[] str_list, String ex){
        String answer = "";

        for(int i =0; i<str_list.length; i++){
            if(str_list[i].contains(ex)){
                str_list[i] = "";
            }
            answer = answer.concat(str_list[i]);
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        String[] arr1 = {"abc","def","ghi"};
        String[] arr2 = {"abc","bbc","cbc"};

        solution(arr1,"ef");
        solution(arr2,"c");
    }
}
