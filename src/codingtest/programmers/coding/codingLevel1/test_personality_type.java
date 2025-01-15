package codingtest.programmers.coding.codingLevel1;
/**
 * TITLE : 성격 유형 검사하기
 * LEVEL : 1
 */
public class test_personality_type {

    public static String solution(String[] survey, int[] choices) {
        String answer = "";
        int R = 0;
        int T = 0;
        int C = 0;
        int F = 0;
        int J = 0;
        int M = 0;
        int A = 0;
        int N = 0;

        for (int i = 0; i < survey.length; i++) {
            if (survey[i].charAt(0) == 'A') {
                if (choices[i] < 4) {
                    A += Math.abs(4 - choices[i]);
                } else if (choices[i] > 4) {
                    N += Math.abs(4 - choices[i]);
                }
            } else if (survey[i].charAt(0) == 'N') {
                if (choices[i] < 4) {
                    N += Math.abs(4 - choices[i]);
                } else if (choices[i] > 4) {
                    A += Math.abs(4 - choices[i]);
                }
            } else if (survey[i].charAt(0) == 'C') {
                if (choices[i] < 4) {
                    C += Math.abs(4 - choices[i]);
                } else if (choices[i] > 4) {
                    F += Math.abs(4 - choices[i]);
                }
            } else if (survey[i].charAt(0) == 'F') {
                if (choices[i] < 4) {
                    F += Math.abs(4 - choices[i]);
                } else if (choices[i] > 4) {
                    C += Math.abs(4 - choices[i]);
                }
            } else if (survey[i].charAt(0) == 'M') {
                if (choices[i] < 4) {
                    M += Math.abs(4 - choices[i]);
                } else if (choices[i] > 4) {
                    J += Math.abs(4 - choices[i]);
                }
            } else if (survey[i].charAt(0) == 'J') {
                if (choices[i] < 4) {
                    J += Math.abs(4 - choices[i]);
                } else if (choices[i] > 4) {
                    M += Math.abs(4 - choices[i]);
                }
            } else if (survey[i].charAt(0) == 'R') {
                if (choices[i] < 4) {
                    R += Math.abs(4 - choices[i]);
                } else if (choices[i] > 4) {
                    T += Math.abs(4 - choices[i]);
                }
            } else if (survey[i].charAt(0) == 'T') {
                if (choices[i] < 4) {
                    T += Math.abs(4 - choices[i]);
                } else if (choices[i] > 4) {
                    R += Math.abs(4 - choices[i]);
                }
            }
        }

        //TR
        if (T == R) {
            answer += "R";
        } else if (R > T){
            answer += "R";
        } else {
            answer += "T";
        }

        //CF
        if (C == F) {
            answer += "C";
        } else if (C > F){
            answer += "C";
        } else {
            answer += "F";
        }

        //JM
        if (J == M) {
            answer += "J";
        } else if (J > M){
            answer += "J";
        } else {
            answer += "M";
        }

        //AN
        if (A == N) {
            answer += "A";
        } else if (A > N){
            answer += "A";
        } else {
            answer += "N";
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(new String[]{"AN", "CF", "MJ", "RT", "NA"}, new int[]{5, 3, 2, 7, 5});
        solution(new String[]{"TR", "RT", "TR"}, new int[]{7, 1, 3});
    }
}
