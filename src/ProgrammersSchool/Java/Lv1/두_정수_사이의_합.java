package ProgrammersSchool.Java.Lv1;

import java.util.stream.LongStream;

public class 두_정수_사이의_합 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println(solution(a, b)); // 12

        a = 3;
        b = 3;
        System.out.println(solution(a, b)); // 3

        a = 5;
        b = 3;
        System.out.println(solution(a, b)); // 3
    }

    public static long solution(int a, int b) {

        return LongStream.range(Math.min(a, b), Math.max(a, b) + 1).sum();

    }
}