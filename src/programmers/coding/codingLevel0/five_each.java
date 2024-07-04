package programmers.coding.codingLevel0;

import java.util.ArrayList;
import java.util.List;
/**
 * TITLE : 5명씩
 * LEVEL : 0
 */
public class five_each {
    public static String[] solution(String[] names) {

        String[] answer = {};
        List<String> list = new ArrayList();

        for(int i =0; i<names.length; i++){
            if(i % 5 == 0){
                list.add(names[i]);
            }
        }

        answer = list.toArray(new String[list.size()]);

        System.out.println(answer[0]);
        System.out.println(answer[1]);

        return answer;
    }

    public static void main(String[] args) {
        String[] arr1 = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
        solution(arr1);
    }
}
