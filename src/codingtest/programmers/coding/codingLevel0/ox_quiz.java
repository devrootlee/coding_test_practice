package codingtest.programmers.coding.codingLevel0;


/**
 * TITLE : ox 퀴즈
 * LEVEL : 0
 */
public class ox_quiz {
    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for(int i = 0; i < quiz.length; i++){
            String[] str = quiz[i].split(" ");
            int sum = Integer.parseInt(str[0]);

            for(int j = 0; j < str.length; j++){
                if(j % 2 != 0){
                    if(str[j].equals("+")){
                        sum += Integer.parseInt(str[j+1]);
                    }else if(str[j].equals("-")){
                        sum -= Integer.parseInt(str[j+1]);
                    }
                }
            }

            if(sum == Integer.parseInt(str[str.length -1])){
                answer[i] = "O";
            }else if(sum != Integer.parseInt(str[str.length -1])){
                answer[i] = "X";
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        String[] str1 = {"3 - 4 = -3", "5 + 6 = 11"};
        String[] str2 = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};

//        solution(str1);
        solution(str2);
    }
}
