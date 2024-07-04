package programmers.coding.codingLevel0;

import java.util.ArrayList;
import java.util.List;

/**
 * TITLE : 문자열 바꿔서 찾기
 * LEVEL : 0
 */
public class find_by_replacing_the_string {

    public static int solution(String myString,String pat){
        int answer = 0;

        List list = new ArrayList();

        for(int i =0; i<myString.length(); i++){
            list.add(myString.charAt(i));
        }

        myString = "";

        for(int i = 0; i < list.size(); i++){
            if(list.get(i).equals('A')){
                list.set(i,'B');
            }else if(list.get(i).equals('B')){
                list.set(i,'A');
            }
        }

        for(int i = 0; i< list.size(); i++){
            myString += list.get(i);
        }


        if(myString.contains(pat) == true){
            answer = 1;
        }else{
            answer = 0;
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution("ABBAA","AABB");
        solution("ABAB","ABAB");
    }
}
