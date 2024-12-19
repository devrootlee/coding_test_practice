package codingtest.programmers.coding.codingLevel1;
/**
 * TITLE : 이상한 문자 만들기
 * LEVEL : 1
 */
public class create_strange_characters {

    public static String solution(String s) {
        StringBuilder answer = new StringBuilder(); // 문자열 효율적으로 처리
        int index = 0; // 단어 내 위치를 추적하는 변수

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                answer.append(" "); // 공백 그대로 추가
                index = 0; // 다음 단어의 시작이므로 index 초기화
            } else {
                if (index % 2 == 0) {
                    answer.append(Character.toUpperCase(c)); // 짝수 인덱스 대문자
                } else {
                    answer.append(Character.toLowerCase(c)); // 홀수 인덱스 소문자
                }
                index++; // 단어 내 위치 증가
            }
        }

        System.out.println(answer);

        return answer.toString();
    }

    public static void main(String[] args) {
        solution("try hello world");
        solution("TRy HElLo  WORLD");
        solution("AA aa ZZ zz");
    }
}
