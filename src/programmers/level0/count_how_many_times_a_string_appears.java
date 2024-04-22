package programmers.level0;
/**
 * TITLE : 문자열이 몇 번 등장하는지 세기
 * LEVEL : 0
 */
public class count_how_many_times_a_string_appears {
    public static int solution(String myString, String pat) {
        int answer = 0;


        for(int i = 0; i < myString.length(); i++){
            String str = "";

            for(int j = i; j < pat.length() + i; j++){

                if(myString.length() - i < pat.length()){
                    break;
                }
                str = str + myString.charAt(j);
            }

            if(str.equals(pat)){
                answer++;
            }
        }

        System.out.println(answer);

        return answer;
    }
    public static void main(String[] args) {

        solution("nanana","nana");
        solution("aaaa","aa");
    }
}
