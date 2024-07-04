package programmers.coding.codingLevel0;
/**
 * TITLE : 모음 제거
 * LEVEL : 0
 */
public class vowel_removal {

    public static String solution(String my_string){
        String a = my_string.replaceAll("a","");
        String n = a.replaceAll("e","");
        String s = n.replaceAll("i","");
        String w = s.replaceAll("o","");
        String answer = w.replaceAll("u","");

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution("bus");
        solution("nice to meet you");
    }
}
