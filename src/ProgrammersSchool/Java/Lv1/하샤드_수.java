package ProgrammersSchool.Java.Lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 하샤드_수 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n)); // true

        n = 12;
        System.out.println(solution(n)); // true

        n = 11;
        System.out.println(solution(n)); // false

        n = 13;
        System.out.println(solution(n)); // false
    }

    public static boolean solution(int x) {
        int num = x;
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return x % sum == 0;
    }
}