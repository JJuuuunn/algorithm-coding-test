package ProgrammersSchool.Java.Lv1;

import java.util.*;

public class 체육복 {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};
        System.out.println(solution(n, lost, reserve));

        reserve = new int[]{3};
        System.out.println(solution(n, lost, reserve));

        n = 3;
        lost = new int[]{3};
        reserve = new int[]{1};
        System.out.println(solution(n, lost, reserve));
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        Arrays.sort(reserve);
        Arrays.sort(lost);

        answer = n - lost.length;

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}