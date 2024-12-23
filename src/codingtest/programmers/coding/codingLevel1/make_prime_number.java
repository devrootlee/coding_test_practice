package codingtest.programmers.coding.codingLevel1;
/**
 * TITLE : 소수 만들기
 * LEVEL : 1
 */
public class make_prime_number {

    public static int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int primeNumber = nums[i] + nums[j] + nums[k];
                    int isPrimeNumber = 0;

                    for (int m = 1; m <= primeNumber; m++) {
                        if (primeNumber % m == 0) isPrimeNumber ++;

                    }
                    if (isPrimeNumber == 2) answer++;
                }
            }
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{1,2,3,4});
        solution(new int[]{1,2,7,6,4});
    }
}
