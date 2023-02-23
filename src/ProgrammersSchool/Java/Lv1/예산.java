package ProgrammersSchool.Java.Lv1;

import java.util.Arrays;

public class 예산 {
    public static void main(String[] args) {

        int[] d = {1, 3, 2, 5, 4};
        int budget = 9;
        System.out.println(solution(d, budget)); // 3

        d = new int[] {2, 2, 3, 3};
        budget = 10;
        System.out.println(solution(d, budget)); // 4
    }

    public static int solution(int[] d, int budget) {
        int dLength = d.length;

        Arrays.sort(d);
        for (int i = 0; i < dLength; i++) {
            budget -= d[i];
            if (budget < 0) {
                return i;
            }
        }

        return dLength;
    }
}
