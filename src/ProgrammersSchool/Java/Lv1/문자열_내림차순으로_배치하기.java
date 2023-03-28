package ProgrammersSchool.Java.Lv1;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class 문자열_내림차순으로_배치하기 {
    public static void main(String[] args) {
        String s = "Zbcdefg";
        System.out.println(solution(s));
    }

    private static String solution(String s) {

        return Arrays.stream(s.split(""))
                .sorted(Collections.reverseOrder())
                .collect(Collectors.joining());

    }
}
