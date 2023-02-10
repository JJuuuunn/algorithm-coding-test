package ProgrammersSchool.Java.Lv0;

import java.util.Arrays;

public class 등수_매기기 {
    public static void main(String[] args) {
        int[][] score = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
        System.out.println(Arrays.toString(solution(score))); // 1, 2, 4, 3

        score = new int[][] {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};
        System.out.println(Arrays.toString(solution(score))); // 4, 4, 6, 2, 2, 1, 7
    }

    public static int[] solution(int[][] score) {
        int[] answer = new int[score.length];

        int[] sum = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            sum[i] = score[i][0] + score[i][1];
        }

        for (int i = 0; i < score.length; i++) {
            int rank = 1;
            for (int j = 0; j < score.length; j++) {
                if (sum[i] < sum[j]) {
                    rank++;
                }
                answer[i] = rank;
            }
        }

        return answer;
    }
}
