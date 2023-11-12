package programmers.level0;

import java.util.ArrayList;
import java.util.List;

/**
 * TITLE : 할 일 목록
 * LEVEL : 0
 */
public class to_do_list {

    public static List solution(String[] todo_list, boolean[] finished) {
        List<String> answer = new ArrayList();

        for(int i=0; i<finished.length; i++){
            if(finished[i] == false){
                answer.add(todo_list[i]);
            }
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        String[] str1 = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] btr1 = {true, false, true, false};

        solution(str1,btr1);

    }
}
