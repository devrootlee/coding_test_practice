package codingtest.programmers.coding.codingLevel1;
/**
 * TITLE : 핸드폰 번호 가리기
 * LEVEL : 1
 */
public class hide_your_cell_phone_number {

    public static String solution(String phone_number) {
        String answer = "";

        String convertStart = phone_number.substring(0,phone_number.length()-4);
        convertStart = convertStart.replaceAll(".","*");
        String end = phone_number.substring(phone_number.length() - 4);

        answer = convertStart + end;
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution("01033334444");
        solution("027778888");
    }
}
