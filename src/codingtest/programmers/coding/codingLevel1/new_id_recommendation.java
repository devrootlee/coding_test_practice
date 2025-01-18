package codingtest.programmers.coding.codingLevel1;
/**
 * TITLE : 신규 아이디 추천
 * LEVEL : 1
 */
public class new_id_recommendation {

    public static String solution(String new_id) {
        String answer = new_id;

        // 1단계: 모든 대문자를 소문자로 변환
        answer = answer.toLowerCase();

        // 2단계: 허용되지 않는 문자 제거
        answer = answer.replaceAll("[^a-z0-9._-]", "");

        // 3단계: 마침표(.)가 연속된 경우 하나로 치환
        answer = answer.replaceAll("\\.{2,}", ".");

        // 4단계: 마침표(.)가 처음이나 끝에 위치하면 제거
        answer = answer.replaceAll("^\\.|\\.$", "");


        // 5단계: 빈 문자열이면 "a"를 대입
        if (answer.isEmpty()) {
            answer = "a";
        }

        // 6단계: 길이가 16자 이상이면 처음 15자로 자르고, 끝에 마침표가 있으면 제거
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15).replaceAll("\\.$", "");
        }

        // 7단계: 길이가 2자 이하라면 마지막 문자를 길이가 3이 될 때까지 반복
        while (answer.length() < 3) {
            answer += answer.charAt(answer.length() - 1);
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution("...!@BaT#*..y.abcdefghijklm");
        solution("z-+.^.");
        solution("=.=");
        solution("123_.def");
        solution("abcdefghijklmn.p");
    }
}
