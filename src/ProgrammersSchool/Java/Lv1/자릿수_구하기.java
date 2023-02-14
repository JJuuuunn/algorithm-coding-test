package ProgrammersSchool.Java.Lv1;

import java.util.Arrays;

public class 자릿수_구하기 {
    public static void main(String[] args) {
        int n = 123;
        System.out.println(solution(n)); // 6

        n = 987;
        System.out.println(solution(n)); // 24
    }

    public static int solution(int n) {
        int answer = 0;

        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}