package programmers.coding.codingLevel1;

/**
 * TITLE : 음양 더하기
 * LEVEL : 1
 */
public class yin_yang_plus {

    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i = 0; i < absolutes.length; i++){
            if(signs[i]==false){
                absolutes[i] = -absolutes[i];
            }

            answer += absolutes[i];
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[] absolutes1 = {4,7,12};
        int[] absolutes2 = {1,2,3};
        boolean[] signs1 = {true,false,true};
        boolean[] signs2 = {false,false,true};

        solution(absolutes1,signs1);
        solution(absolutes2,signs2);
    }
}
