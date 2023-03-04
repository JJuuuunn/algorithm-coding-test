import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static boolean[][] board; // main 에서 색깔을 입력 받고 checkColor 메소드에서 사용하기 위해 static 으로 꺼냇다.
    static int minCnt = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // N, M 입력 받기
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // board 에 색깔 넣기 'W' 면 true, 'B' 면 false
        board = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            String colors = br.readLine();
            for (int j = 0; j < M; j++) {
                // boolean[][] 의 디폴트값은 false
                if (colors.charAt(j) == 'W') {
                    board[i][j] = true;
                }
            }
        }

        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                checkColor(i, j);
            }
        }

        System.out.println(minCnt);
    }

    private static void checkColor(int x, int y) {


        boolean color = true; // 색깔 지정
        int cnt = 0; // 틀린 갯수 카운트

        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                if (board[i][j] != color) {
                    cnt++;
                }
                color = !color; // 옆으로 한칸 이동할 때 마다 색깔 변경
            }
            color = !color; // 아래로 한칸 이동할 때 마다 시작 되는 색깔 변경
        }
        // 흰색으로 하나 검정색으로 하나 두 가지의 경우의 수 에서 나온 틀린 색을 합치면 64이다.
        cnt = Math.min(cnt, 64 - cnt);
        // '브르투 포스'로 한칸 씩 이동 할때마다 나오는 cnt 로 비교하여 가장 작은 값만 저장
        minCnt = Math.min(cnt, minCnt);
    }
}