package codingtest.programmers.coding.codingLevel1;

/**
 * TITLE : 숫자 문자열과 영단어
 * LEVEL : 1
 */
public class numeric_strings_and_english_words {

    public static int solution(String s) {
        int answer = 0;

        s = s.replaceAll("zero","0");
        s = s.replaceAll("one","1");
        s = s.replaceAll("two","2");
        s = s.replaceAll("three","3");
        s = s.replaceAll("four","4");
        s = s.replaceAll("five","5");
        s = s.replaceAll("six","6");
        s = s.replaceAll("seven","7");
        s = s.replaceAll("eight","8");
        s = s.replaceAll("nine","9");

        answer = Integer.parseInt(s);
        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution("one4seveneight");
        solution("23four5six7");
        solution("2three45sixseven");
        solution("123");
    }
}
