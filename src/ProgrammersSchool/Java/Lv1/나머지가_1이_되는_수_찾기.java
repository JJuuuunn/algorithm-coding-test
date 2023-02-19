package ProgrammersSchool.Java.Lv1;

import java.util.stream.IntStream;

public class 나머지가_1이_되는_수_찾기 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n)); // 3

        n = 12;
        System.out.println(solution(n)); // 11
    }

    private static int solution(int n) {
        int answer = 0;

        for (int i = 2; i < n; i++) {
            if (n % i == 1) {
                return i;
            }
        }

        return answer;
        /*
            IntStream 을 사용하여 한줄로 요약
            return IntStream.range(2, n).filter(i -> n % i == 1).findFirst().getAsInt();
        */
    }
}