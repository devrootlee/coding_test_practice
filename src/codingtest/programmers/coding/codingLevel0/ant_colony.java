package codingtest.programmers.coding.codingLevel0;

public class ant_colony {

    public static int solution(int hp){
        int answer = 0;
        int five = 0;
        int three = 0;
        int one = 0;

        five = hp / 5;
        three = (hp - 5 * five) / 3;
        one = (hp - 5 * five - 3 * three) / 1;

        answer = five + three + one;

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(23);
        solution(24);
        solution(999);
    }
}
