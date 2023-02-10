package ProgrammersSchool.Java.Lv0;

import java.util.Arrays;

public class 캐릭터의_좌표 {
    public static void main(String[] args) {
        String[] keyinput = {"left", "right", "up", "right", "right"};
        int[] board = {11, 11};
        System.out.println(Arrays.toString(solution(keyinput, board)));

        keyinput = new String[]{"down", "down", "down", "down", "down"};
        board = new int[]{7, 9};
        System.out.println(Arrays.toString(solution(keyinput, board)));

        keyinput = new String[]{"down", "up"};
        board = new int[]{3, 3};
        System.out.println(Arrays.toString(solution(keyinput, board)));

        keyinput = new String[]{"left", "left", "left", "right", "left"};
        board = new int[]{3, 3};
        System.out.println(Arrays.toString(solution(keyinput, board)));

        keyinput = new String[]{"down", "down", "down", "up", "down"};
        board = new int[]{3, 3};
        System.out.println(Arrays.toString(solution(keyinput, board)));
    }

    public static int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};

        for (String key : keyinput) {
            if (key.equals("left") && board[0] / 2 * -1 < (answer[0])) {
                    answer[0] -= 1;
            } else if (key.equals("down") && board[1] / 2 * -1 < (answer[1])) {
                answer[1] -= 1;
            } else if (key.equals("right") && board[0] / 2 > answer[0]) {
                answer[0] += 1;
            } else if (key.equals("up") && board[1] / 2 > answer[1]) {
                    answer[1] += 1;
            }
        }

        return answer;
    }
}
