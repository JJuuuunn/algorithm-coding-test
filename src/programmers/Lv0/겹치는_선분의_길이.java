package programmers.Lv0;

public class 겹치는_선분의_길이 {
    public static void main(String[] args) {
        int[][] lines = {{0, 1}, {2, 5}, {3, 9}};
        System.out.println(solution(lines));

        lines = new int[][]{{-1, 1}, {1, 3}, {3, 9}};
        System.out.println(solution(lines));

        lines = new int[][]{{0, 5}, {3, 9}, {1, 10}};
        System.out.println(solution(lines));
    }

    public static int solution(int[][] lines) {
        int answer = 0;

        int[] arr = new int[200];

        for (int[] line : lines) {
            for (int i = line[0] + 100; i < line[1] + 100; i++) {
                arr[i]++;
            }
        }

        for (int i = 0; i < 200; i++) {
            if (arr[i] > 1) {
                answer++;
            }
        }

        return answer;
    }
}
