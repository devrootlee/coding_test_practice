package programmers.level0;

public class return_different_values_depending_on_flag {

    public static int solution(int a, int b, boolean flag) {
        int answer = 0;


        if(flag == true){
            answer = a + b;
        }else{
            answer = a - b;
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(-4, 7, true);
        solution(-4, 7, false);
    }
}
