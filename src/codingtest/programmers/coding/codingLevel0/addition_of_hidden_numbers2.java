package codingtest.programmers.coding.codingLevel0;

import java.util.ArrayList;
import java.util.List;

/**
 * TITLE : 숨어있는 숫자의 덧셈 (2)
 * LEVEL : 0
 */
public class addition_of_hidden_numbers2 {

    public static int solution(String my_string) {
        int answer = 0;
        List<Integer> indexList = new ArrayList<>();
        int temp = 0;
        for(int i = 0; i <my_string.length(); i++){
            char ch = my_string.charAt(i);
            if(Character.isDigit(ch)){
                temp = temp * 10 + Character.getNumericValue(ch);
            }else {
                indexList.add(temp);
                temp = 0;
            }

            System.out.println(indexList);
        }
        indexList.add(temp);
        answer = indexList.stream().reduce(0,Integer :: sum);

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
//        solution("aAb1B2cC34oOp");
        solution("1a2b3c4d123Z");
    }
}
