package programmers.coding.codingLevel0;
/**
 * TITLE : 날짜 비교하기
 * LEVEL : 0
 */
public class compare_dates {

    public static int solution(int[] date1, int[] date2) {
        int answer = 0;
        String day1 = "";
        String day2 = "";

        for(int i = 0; i < date1.length; i++){
            day1 += date1[i];
        }

        for(int i = 0; i < date2.length; i++){
            day2 += date2[i];
        }


        answer = (Integer.parseInt(day1) < Integer.parseInt(day2)) ? 1 : 0;


        return answer;
    }

    public static void main(String[] args) {
        int[] date11 = {2021,12,28};
        int[] date12 = {1024,10,24};
        int[] date21 = {2021,12,29};
        int[] date22 = {1024,10,24};

        solution(date11,date21);
        solution(date12,date22);
    }
}
