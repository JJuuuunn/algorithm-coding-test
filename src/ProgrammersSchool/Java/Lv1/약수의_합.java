package ProgrammersSchool.Java.Lv1;

public class 약수의_합 {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(solution(n)); // 28

        n = 5;
        System.out.println(solution(n)); // 6
    }

    public static int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }
}