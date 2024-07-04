package programmers.coding.codingLevel0;

import java.util.ArrayList;
import java.util.List;

/**
 * TITLE : 리스트 자르기
 * LEVEL : 0
 */
public class truncate_list {
    public static int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        List list = new ArrayList<>();
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        // n = 1 : 0 ~ slicer 두번째 인덱스
        // n = 2 : slicer 첫번째 인덱스 ~ num_list 마지막 인덱스
        // n = 3 : slicer 첫번째 인덱스 ~ slicer 두번째 인덱스
        // n = 4 : slicer 첫번째 인덱스 ~ slicer 두번째 인덱스, slicer 마지막 인덱스 간격

        if(n == 1){
            for(int i = 0; i <= b; i++){
                list.add(num_list[i]);
            }


        }else if(n == 2){
            for(int i = a; i < num_list.length; i++){
                list.add(num_list[i]);
            }
        }else if(n == 3){
            for(int i = a; i <= b; i++){
                list.add(num_list[i]);
            }
        }else if(n == 4){
            for(int i = a; i <= b; i=i+c){
                list.add(num_list[i]);
            }
        }

        answer = new int[list.size()];

        for(int i = 0 ; i < list.size(); i++){
            answer[i] = Integer.parseInt(list.get(i).toString());
        }

        System.out.println(list);
        return answer;
    }

    public static void main(String[] args) {
        int[] slicer1 = {1, 5, 2};
        int[] slicer2 = {1, 5, 2};
        int[] num_list1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num_list2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        solution(3,slicer1,num_list1);
        solution(4,slicer2,num_list2);

    }
}
