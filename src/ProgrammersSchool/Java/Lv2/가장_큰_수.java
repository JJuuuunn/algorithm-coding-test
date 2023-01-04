package ProgrammersSchool.Java.Lv2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 가장_큰_수 {

    public static void main(String[] args) {
        int[] numbers = {6, 10, 2};
        System.out.println(solution(numbers)); // "6210"

        numbers = new int[] {3, 30, 34, 5, 9};
        System.out.println(solution(numbers)); // "9534330"

        numbers = new int[] {0, 0, 0, 0};
        System.out.println(solution(numbers)); // "0"
    }

    private static String solution(int[] numbers) {
        String Arr = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .sorted((o1, o2) -> (o2 + o1).compareTo(o1 + o2))
                .collect(Collectors.joining());
        System.out.println(Arr.charAt(0));
        return (Arr.charAt(0) == '0') ? "0" : Arr;
    }
}
