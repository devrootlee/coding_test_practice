package programmers.level0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
/**
 * TITLE : 유한 소수 판별하기
 * LEVEL : 0
 */
public class determining_finite_decimal_numbers {

    public static int solution(int a, int b) {
        int answer = 0;
        BigInteger a1 = BigInteger.valueOf(a);
        BigInteger b1 = BigInteger.valueOf(b);
        BigInteger gcd = a1.gcd(b1);
        List<Integer> list = new ArrayList<>();

        b /= gcd.intValue();

        for(int i = 2; i <= b; i++) {
            while(b % i == 0) {
                list.add(i);
                b /= i;
            }
        }
        int firstListSize = list.size();

        while(list.remove(Integer.valueOf(2)));
        while(list.remove(Integer.valueOf(5)));

        int lastListSize = list.size();

        if(list.size() == 0){
            answer = 1;
        }else {
            answer = 2;
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
//        solution(7,20);
//        solution(11,22);
//        solution(12,21);
        solution(1,30);
    }

}
