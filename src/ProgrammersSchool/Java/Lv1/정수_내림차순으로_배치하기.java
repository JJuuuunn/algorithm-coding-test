package ProgrammersSchool.Java.Lv1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class 정수_내림차순으로_배치하기 {
    public static void main(String[] args) {
        long n = 118372;
        System.out.println(solution(n)); // 873211

        n = 15924548;
        System.out.println(solution(n)); // 98554421
    }

    private static long solution(long n) {
        long answer = 0;

        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr, Comparator.reverseOrder());

        answer = Long.parseLong(Arrays.stream(arr).collect(Collectors.joining()));

        return answer;
    }
}
