package codingtest.programmers.coding.codingLevel1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * TITLE : 다트 게임
 * LEVEL : 1
 */
public class dart_game {

    public static int solution(String dartResult) {
        int answer = 0;

        // 숫자를 기준으로 배열 자름
        String[] strSplit = dartResult.split("\\d+");
        // 정규표현식을 사용하여 숫자만 추출
        Pattern pattern = Pattern.compile("\\d+"); // 연속된 숫자만 찾기
        Matcher matcher = pattern.matcher(dartResult);

        // 결과 저장 리스트
        List<Integer> numbers = new ArrayList<>();

        while (matcher.find()) { // 일치하는 숫자 찾기
            numbers.add(Integer.parseInt(matcher.group())); // 숫자 변환 후 추가
        }

        //숫자 배열
        int[] numArr = numbers.stream().mapToInt(i -> i).toArray();

        //문자 배열
        String[] strArr = Arrays.stream(strSplit)
                .filter(s -> !s.isEmpty()) // 빈 문자열 제거
                .toArray(String[]::new);

        List<Integer> formulaList = new ArrayList<>();
        for (int i = 0; i < strArr.length; i++) {
            int subAns = 0;
            for (int j = 0; j < strArr[i].length(); j++) {
                if (strArr[i].charAt(j) == 'S') {
                    subAns += Math.pow(numArr[i], 1);
                } else if (strArr[i].charAt(j) == 'D') {
                    subAns += Math.pow(numArr[i], 2);
                } else if (strArr[i].charAt(j) == 'T') {
                    subAns += Math.pow(numArr[i], 3);
                } else if (strArr[i].charAt(j) == '*') {
                    if (i == 0) {
                        subAns *= 2;
                    } else {
                        subAns *= 2;
                        formulaList.set(i - 1, formulaList.get(i - 1) * 2);
                    }
                } else if (strArr[i].charAt(j) == '#') {
                    subAns *= -1;
                }
            }
            formulaList.add(subAns);
        }

        for (int item : formulaList) {
            answer += item;
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution("1S2D*3T");
        solution("1D2S#10S");
        solution("1D2S0T");
        solution("1S*2T*3S");
        solution("1D#2S*3S");

    }
}
