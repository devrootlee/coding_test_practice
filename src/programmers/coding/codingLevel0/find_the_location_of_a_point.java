package programmers.coding.codingLevel0;
/**
 * TITLE : 점의 위치 구하기
 * LEVEL : 0
 */
public class find_the_location_of_a_point {

    public static int solution(int[] dot){
        int answer = 0;
        boolean cond1 = (dot.length == 2);
        boolean cond2 = (dot[0]!=0)&(dot[1]!=0);
        boolean cond3 = (dot[0]>=-500)&(dot[0]<=500)&(dot[1]>=-500)&(dot[1]<=500);

        if((cond1 == true)&(cond2 == true)&(cond3 == true)){

            if((dot[0]>0)&(dot[1]>0)){
                answer = 1;
            }
            else if((dot[0]<0)&(dot[1]>0)){
                answer = 2;
            }
            else if((dot[0]<0)&(dot[1])<0){
                answer = 3;
            }
            else if((dot[0]>0)&(dot[1]<0)){
                answer = 4;
            }

        }else{
            answer = -1;
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {2,4};
        int[] arr2 = {-7,9};

        solution(arr1);
        solution(arr2);
    }
}
