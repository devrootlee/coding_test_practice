package programmers.level0;

/**
 * TITLE : 배열의 유사도
 * LEVEL : 0
 */
public class array_similarity {

    public static int solution(String[] s1, String[] s2) {
        int answer = 0;


        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if(s1[i].equals(s2[j])){
                    answer++;
                }
            }
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        String[] arr1 = {"a", "b", "c"};
        String[] arr2 = {"com", "b", "d", "p", "c"};
        String[] arr3 = {"n", "omg"};
        String[] arr4 = {"m", "dot"};

        solution(arr1, arr2);
        solution(arr3, arr4);
    }
}
