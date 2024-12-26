package codingtest.programmers.coding.codingLevel1;
/**
 * TITLE : 덧칠하기
 * LEVEL : 1
 */
public class apply_more_paint {

    public static int solution(int n, int m, int[] section) {
        int answer = 0;

        int distance = 0;
        for (int i = 0; i < section.length; i++){
            if (section[i] <= distance) continue;

            distance = section[i] + m - 1;
            answer++;
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(8,4,new int[]{2,3,6});
        solution(5,4,new int[]{1,3});
        solution(4,1,new int[]{1,2,3,4});
        solution(5,2,new int[]{1,4,5});
    }
}
