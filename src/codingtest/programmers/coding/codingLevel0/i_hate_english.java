package codingtest.programmers.coding.codingLevel0;
/**
 * TITLE : 영어가 싫어요.
 * LEVEL : 0
 */
public class i_hate_english {
    public static long solution(String numbers) {
        long answer = 0;

        if(numbers.contains("zero")){
            numbers = numbers.replace("zero","0");
        }if(numbers.contains("one")){
            numbers = numbers.replace("one","1");
        }if(numbers.contains("two")){
            numbers = numbers.replace("two","2");
        }if(numbers.contains("three")){
            numbers = numbers.replace("three","3");
        }if(numbers.contains("four")){
            numbers = numbers.replace("four","4");
        }if(numbers.contains("five")){
            numbers = numbers.replace("five","5");
        }if(numbers.contains("six")){
            numbers = numbers.replace("six","6");
        }if(numbers.contains("seven")){
            numbers = numbers.replace("seven","7");
        }if(numbers.contains("eight")){
            numbers = numbers.replace("eight","8");
        }if(numbers.contains("nine")){
            numbers = numbers.replace("nine","9");
        }

        answer = Long.parseLong(numbers);

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution("onetwothreefourfivesixseveneightnine");
        solution("onefourzerosixseven");
    }
}
