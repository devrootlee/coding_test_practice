package codingtest.programmers.coding.codingLevel0;
/**
 * TITLE : 커피 심부름
 * LEVEL : 0
 */
public class coffee_errands {
    public static int solution(String[] order) {
        int answer = 0;


        for(int i = 0; i < order.length; i++){
            if(order[i].contains("anything") || order[i].contains("americano")){
                answer += 4500;
            }else if(order[i].contains("cafelatte")){
                answer += 5000;
            }
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        String[] str1 = {"cafelatte", "americanoice", "hotcafelatte", "anything"};
        String[] str2 = {"americanoice", "americano", "iceamericano"};

        solution(str1);
        solution(str2);
    }
}
