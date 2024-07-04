package programmers.coding.codingLevel0;
/**
 * TITLE : 배열 원소의 길이
 * LEVEL : 0
 */
public class length_of_array {

    public static int[] solution(String[] strlist){
        int[] answer = new int[strlist.length];

        for(int i = 0; i<strlist.length; i++){
            answer[i] = strlist[i].length();
        }

        for(int i = 0; i<answer.length; i++){
            System.out.println(answer[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] arr1 ={"We","are","the","world!"};
        String[] arr2 ={"I","Love","Programmers."};

        solution(arr1);
        solution(arr2);
    }
}
