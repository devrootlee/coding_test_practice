package codingtest.programmers.coding.codingLevel1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * TITLE : 추억 점수
 * LEVEL : 1
 */
public class memory_score {
    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        List<String> nameList = new ArrayList<>(Arrays.asList(name));

        for(int i = 0; i < photo.length; i++){
            int memoryScore = 0;
            for(int j = 0; j < photo[i].length; j++){
                if(nameList.indexOf(photo[i][j]) != -1){
                    memoryScore += yearning[nameList.indexOf(photo[i][j])];
                }
            }
            answer[i] = memoryScore;
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        String[] name1 = {"may", "kein", "kain", "radi"};
        String[] name2 = {"kali","mari","don"};
        String[] name3 = {"may", "kein", "kain", "radi"};
        int[] yearning1 = {5,10,1,3};
        int[] yearning2 = {11,1,55};
        int[] yearning3 = {5,10,1,3};
        String[][] photo1 = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"},{"kon", "kain", "may", "coni"}};
        String[][] photo2 = {{"kali", "mari", "don"},{"pony", "tom", "teddy"},{"con", "mona", "don"}};
        String[][] photo3 = {{"may"},{"kein","deny","may"},{"kon","coni"}};

        solution(name1,yearning1,photo1);
        solution(name2,yearning2,photo2);
        solution(name3,yearning3,photo3);
    }
}
