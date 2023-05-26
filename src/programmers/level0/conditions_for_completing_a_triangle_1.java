package programmers.level0;
/**
 * TITLE : 삼각형의 완성조건(1)
 * LEVEL : 0
 */
public class conditions_for_completing_a_triangle_1 {

    public static int solution(int[] sides){
        int answer = 0;
        int longSide = sides[0];
        int[] otherSide = new int[2];

        for(int i = 0; i < sides.length; i++){
            if(longSide < sides[i]){
                longSide = sides[i];
                System.out.println(i);
            }
        }

        System.out.println(longSide);

        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {3,6,2};
        int[] arr3 = {199,72,222};

        solution(arr1);
        solution(arr2);
        solution(arr3);
    }
}
