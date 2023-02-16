package ProgrammersSchool.Java.Lv2;

import java.util.Arrays;

public class 최솟값_만들기 {
    public static void main(String[] args) {
        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};
        System.out.println(solution(A, B)); // 29

        A = new int[]{1, 2};
        B = new int[]{3, 4};
        System.out.println(solution(A, B)); // 10
    }

    public static int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[B.length - i - 1];
        }
        return answer;
    }
}
