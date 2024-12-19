package codingtest.programmers.coding.codingLevel0;
/**
 * TITLE : A 강조하기
 * LEVEL : 0
 */
public class a_Emphasize {

    public static String solution(String myString){
        String answer = "";

        myString = myString.toLowerCase();
        answer = myString.replace("a","A");

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution("abstract algebra");
        solution("PrOgRaMmErS");
    }
}
