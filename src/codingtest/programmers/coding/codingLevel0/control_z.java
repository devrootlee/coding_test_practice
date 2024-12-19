package codingtest.programmers.coding.codingLevel0;

import java.util.Stack;

/**
 * TITLE : 컨트롤 제트
 * LEVEL : 0
 */
public class control_z {

    public static int solution(String s){
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for(String t : s.split(" ")) {
            if(t.equals("Z")) {
                if(!stack.isEmpty())
                    answer -= stack.pop();
            }
            else
                answer += stack.push(Integer.parseInt(t));
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {

        solution("1 2 Z 3");
        solution("10 20 30 40");
        solution("10 Z 20 Z");
        solution("-1 -2 -3 Z");
    }
}
