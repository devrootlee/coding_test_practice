package codingtest.programmers.coding.codingLevel0;

import java.util.ArrayList;
import java.util.List;

/**
 * TITLE : 그림 확대
 * LEVEL : 0
 */
public class enlarge_the_picture {
    public static String[] solution(String[] picture, int k) {
        String[] answer = {};
        List<String> aList = new ArrayList<>();
        List<String> bList = new ArrayList<>();

        for(int i = 0; i < picture.length; i++){
            int length = picture[i].length();
            String f = "";

            for(int j = 0; j <length; j++){
                char test = picture[i].charAt(j);
                for(int t = 0; t < k; t++){
                    f += test;
                    for(int v = 0; v < k; v++){

                    }
                }
            }
            aList.add(f);
        }

        for(int i = 0; i < aList.size(); i++){
            for(int j = 0; j < k; j++){
                bList.add(aList.get(i));
            }
        }

        answer = new String[bList.size()];

        for(int i = 0; i < bList.size(); i++){
            answer[i] = bList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] str1 = {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};
        String[] str2 = {"x.x", ".x.", "x.x"};

//        solution(str1,2);
        solution(str2,3);
    }
}
