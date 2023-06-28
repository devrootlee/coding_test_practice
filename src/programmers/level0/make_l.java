package programmers.level0;
/**
 * TITLE : l로 만들기
 * LEVEL : 0
 */
public class make_l {

    public static String solution(String myString){
        String answer = "";

        for(int i =0; i<myString.length(); i++){
            if(Integer.valueOf(myString.charAt(i)) < Integer.valueOf('l')){
                myString = myString.replace(myString.charAt(i),'l');
            }
        }

        answer = myString;

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution("abcdevwxyz");
        solution("jjnnllkkmm");
    }
}
