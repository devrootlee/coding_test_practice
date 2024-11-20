package programmers.coding.codingLevel1;


import java.util.*;

/**
 * TITLE : 두 개 뽑아서 더하기
 * LEVEL : 1
 */
public class take_two_and_add_them {

    public static int[] solution(int[] numbers) {
        int[] answer = {};
        HashSet<Integer> set = new HashSet();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        System.out.println(Arrays.toString(answer));

        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {2,1,3,4,1};
        int[] arr2 = {5,0,2,7};

        solution(arr1);
        solution(arr2);
    }
}
