package programmers.coding.codingLevel0;
/**
 * TITLE : 외계어 사전
 * LEVEL : 0
 */
public class alien_language_dictionary {

    public static int solution(String[] spell, String[] dic) {
        int answer = 0;

        for(int i = 0; i <dic.length; i++){
            int dicLength = dic[i].length();
            int match = 0;

            if(dicLength == spell.length){
                for(int j = 0; j < spell.length; j++){
                    if(dic[i].contains(spell[j])){
                        match++;
                    }
                }
                if(match == spell.length){
                    answer = 1;
                }
            }
        }

        if(answer == 0){
            answer = 2;
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        String[] strArr1 = {"p","o","s"};
        String[] strArr2 = {"z","d","x"};
        String[] strArr3 = {"s","o","m","d"};
        String[] strArrA = {"sod", "eocd", "qixm", "adio", "soo"};
        String[] strArrB = {"def", "dww", "dzx", "loveaw"};
        String[] strArrC = {"moos", "dzx", "smm", "sunmmo", "som"};

        solution(strArr1,strArrA);
        solution(strArr2,strArrB);
        solution(strArr3,strArrC);
    }
}
