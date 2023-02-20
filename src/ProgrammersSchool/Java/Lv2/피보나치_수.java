package ProgrammersSchool.Java.Lv2;

public class 피보나치_수 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(solution(n)); // 2

        n = 5;
        System.out.println(solution(n)); // 5
    }

    public static int solution(int n) {
        int[] answer = new int[n + 1];
        answer[0] = 0;
        answer[1] = 1;

        for (int i = 2; i <= n; i++) {
            answer[i] = (answer[i - 2] + answer[i - 1]) % 1234567;
        }
        return answer[n];
        /*
            만제 설명대로 마지막 수를 1234567을 나눈 나머지를 리턴할 시,
            후에 너무 큰 수가 되어 Integer.MAX_VALUE 값을 넘길 수 있기 때문에
            질문하기에 어떤 분이 적어두신것처럼
            F(n - 1) + F(n - 2) = F(n) 에서
            F(n) % 1234567
            => (F(n - 1) + F(n - 2)) % 1234567
            => (F(n - 1) % 1234567) + (F(n - 2) % 1234567)
            이기 떄문에 마지막에 나누지 않고 반복문에서 나누었다.
         */
    }
}