package programmers.level0;

import java.util.ArrayList;
import java.util.List;

/**
 * TITLE : 빈 배열에 추가, 삭제하기
 * LEVEL : 0
 */
public class adding_and_deleting_from_an_empty_array {
    public static int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(flag[i] == true){
                for(int j = 0; j < arr[i] * 2; j++){
                    list.add(arr[i]);
                }
            }else {
                for(int j = 0; j < arr[i]; j++){
                    list.remove(list.size() - 1);
                }
            }
        }

        answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
            System.out.println(answer[i]);
        }


        return answer;
    }
    public static void main(String[] args) {
        int[] arr1 = {3, 2, 4, 1, 3};
        boolean[] bool1 = {true, false, true, false, false};

        solution(arr1, bool1);
    }
}
