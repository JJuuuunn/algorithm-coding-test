package ProgrammersSchool.Java.Lv1;

import java.util.Arrays;

public class 짝수와_홀수 {
    public static void main(String[] args) {
        int num = 3;
        System.out.println(solution(num)); // Odd

        num = 4;
        System.out.println(solution(num)); // Even

        num = -123;
        System.out.println(solution(num)); // Odd
    }

    public static String solution(int num) {
        /*
            num 이 음수일 경우 나머지 값이 -1이 나올 수 있으므로
            나머지가 0일경우 짝수 나머지들은 홀수로 판별
         */
        return num % 2 == 0 ? "Even" : "Odd";
    }
}
