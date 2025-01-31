package codingtest.programmers.coding.codingLevel1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * TITLE : 개인정보 수집 유효기간
 * LEVEL : 1
 */
public class personal_information_collection_expiration_period {

    public static String convertDate(String date,String term) {
        String convertDate = date;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate orginalDate = LocalDate.parse(date, formatter);

        int year = orginalDate.getYear();
        int month = orginalDate.getMonthValue();
        int day = Math.min(orginalDate.getDayOfMonth(), 28); // 28일 고정

        // term 개월 후 계산
        month += Integer.parseInt(term);
        if (month > 12) {
            year += (month - 1) / 12; // 초과된 월 수만큼 연도 증가
            month = (month - 1) % 12 + 1; // 12월 초과시 1월부터 시작하도록 조정
        }

        // 하루 빼기 로직 (1일이면 28일로 변경)
        if (day == 1) {
            month -= 1;
            if (month == 0) {
                month = 12;
                year -= 1;
            }
            day = 28;
        } else {
            day -= 1;
        }

//        System.out.println(year);
//        System.out.println(month);
//        System.out.println(day);

        LocalDate newDate = LocalDate.of(year, month, day);

        convertDate = newDate.format(formatter);

        return convertDate;
    }

    public static int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};

        //코드별 유효기간 값 을 map으로 변환하여 저장
        Map<String,String> termMap = new HashMap<>();
        for (String term : terms) {
            String[] s = term.split(" ");
            termMap.put(s[0],s[1]);
        }
        List<Integer> answerList = new ArrayList<>();
        for (int i = 0; i < privacies.length; i++) {
            String convertDate = convertDate(privacies[i].split(" ")[0], termMap.get(privacies[i].split(" ")[1]));

            System.out.println(convertDate);
            if (today.compareTo(convertDate) > 0) {
                answerList.add(i + 1);
            }
        }

        answer = new int[answerList.size()];

        int i = 0;
        for (int item : answerList) {
            answer[i] = item;
            i++;
        }

        return answer;
    }

    public static void main(String[] args) {
//        solution("2022.05.19", new String[]{"A 6", "B 12", "C 3"}, new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"});
        solution("2020.01.01", new String[]{"Z 3", "D 5"}, new String[]{"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"});
//        solution("2023.01.01", new String[]{"A 6"}, new String[]{"2022.07.01 A", "2022.07.01 A", "2022.07.01 A"});
    }
}
