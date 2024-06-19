package programmers.level0;
/**
 * TITLE : 간단한 식 계산하기
 * LEVEL : 0
 */
public class evaluate_simple_expressions {
    public static int solution(String binomial) {
        int answer = 0;
        String[] sick = {};

        if(binomial.contains("+")){
            sick = binomial.split("\\+");
        }else if(binomial.contains("-")){
            sick = binomial.split("-");
        }else if(binomial.contains("*")){
            sick = binomial.split("\\*");
        }

        int a = Integer.parseInt(sick[0].trim());
        int b = Integer.parseInt(sick[1].trim());

        if(binomial.contains("+")){
            answer = a + b;
        }else if(binomial.contains("-")){
            answer = a - b;
        }else if(binomial.contains("*")){
            answer = a * b;
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution("43 + 12");
        solution("0 - 7777");
        solution("40000 * 40000");
    }
}
