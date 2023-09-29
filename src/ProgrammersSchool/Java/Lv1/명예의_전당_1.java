package ProgrammersSchool.Java.Lv1;

import java.util.*;

public class 명예의_전당_1 {
    public static void main(String[] args) {
        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        System.out.println(solution(k, score));

        k = 4;
        score = new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        System.out.println(solution(k, score));
    }

    private static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            if(temp.size() < k) {
                temp.add(score[i]);
                Collections.sort(temp);
                answer[i] = temp.get(0);
                continue;
            }

            if(temp.size() == k) {
                int minNum = temp.get(0);

                if(minNum < score[i]) {
                    temp.remove(0);
                    temp.add(score[i]);
                    Collections.sort(temp);
                }

                answer[i] = temp.get(0);
            }
        }

        return answer;
    }
}
