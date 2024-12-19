package codingtest.programmers.coding.codingLevel0;

import java.util.ArrayList;
import java.util.List;

/**
 * TITLE : 왼쪽 오른쪽
 * LEVEL : 0
 */
public class left_right {
    public static String[] solution(String[] str_list) {
        String[] answer = {};
        List<String> list = new ArrayList<>();

        int cnt = 0;
        String lr = "";
        while(cnt < str_list.length){
            if(str_list[cnt].equals("l")){
                lr = "l";
                break;
            }else if(str_list[cnt].equals("r")){
                lr = "r";
                break;
            }else {
                lr = "empty";
            }
            cnt++;
        }

        if(lr.equals("empty")){

        }else if(lr.equals("l")){
            for(int i = 0; i < cnt; i++){
                list.add(str_list[i]);
            }
        }else if(lr.equals("r")){
            for(int i = cnt + 1; i < str_list.length; i++){
                list.add(str_list[i]);
            }
        }

        answer = new String[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        System.out.println(list);
        return answer;
    }

    public static void main(String[] args) {
        String[] str1 = {"u","f","u","r"};
        String[] str2 = {"l"};

        solution(str1);
//        solution(str2);
    }
}
