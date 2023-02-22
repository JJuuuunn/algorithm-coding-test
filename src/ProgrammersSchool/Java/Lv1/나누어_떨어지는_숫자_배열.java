package ProgrammersSchool.Java.Lv1;

import java.util.Arrays;

public class 나누어_떨어지는_숫자_배열 {
    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        System.out.println(Arrays.toString(solution(arr, divisor))); // 	[5, 10]

        arr = new int[] {2, 36, 1, 3};
        divisor = 1;
        System.out.println(Arrays.toString(solution(arr, divisor))); // 	[1, 2, 3, 36]

        arr = new int[] {3,2,6};
        divisor = 10;
        System.out.println(Arrays.toString(solution(arr, divisor))); // 	[-1]
    }

    public static int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(x -> x % divisor == 0).sorted().toArray();

        return answer.length == 0 ? new int[] {-1} : answer;
    }
}