package programmers.level0;
/**
 * TITLE : 수 조작하기 1
 * LEVEL : 0
 */
public class manipulate_the_number_1 {

    public static int solution(int n, String control){
        int answer = n;

        for(int i =0; i<control.length(); i++){
            if(control.charAt(i) == 'w'){
                answer += 1;
            }else if(control.charAt(i) == 's'){
                answer -= 1;
            }else if(control.charAt(i) == 'd'){
                answer += 10;
            }else if(control.charAt(i) == 'a'){
                answer -= 10;
            }
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(0,"wsdawsdassw");
    }
}
