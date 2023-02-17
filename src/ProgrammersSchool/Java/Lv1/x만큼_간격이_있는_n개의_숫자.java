package ProgrammersSchool.Java.Lv1;

import java.util.Arrays;

public class x만큼_간격이_있는_n개의_숫자 {
    public static void main(String[] args) {
        int x = 3;
        int n = 5;
        System.out.println(Arrays.toString(solution(x, n))); // [2,4,6,8,10]

        x = 4;
        n = 3;
        System.out.println(Arrays.toString(solution(x, n))); // [4,8,12]

        x = -4;
        n = 2;
        System.out.println(Arrays.toString(solution(x, n))); // [-4, -8]
    }

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = 0;
        for (int i = 0; i < n; i++) {
            num+= x;
            answer[i] = num;
        }
        return answer;
    }
}
