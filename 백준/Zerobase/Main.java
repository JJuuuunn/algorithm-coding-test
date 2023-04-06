import java.io.*;
import java.util.*;

public class Main {

    static int[][] dirs = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    static int result,n, k;
    static int[] attack;
    static int[][] map, source;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());
        source = new int[n][n];
        map = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                source[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        attack = new int[k];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < k; i++) {
            attack[i] = Integer.parseInt(st.nextToken());
        }

        dfs(new int[k], 0);
        System.out.println(result);
    }

    private static void dfs(int[] arr, int idx) {
        if (idx >= k) {
            startGame(arr, clearMap());
            return;
        }

        for (int i = 0; i < n; i++) {
            arr[idx] = i;
            dfs(arr, idx + 1);
        }
    }

    private static int[][] clearMap() {
        for (int i = 0; i < n; i++) {
            System.arraycopy(source[i], 0, map[i], 0, n);
        }
        return map;
    }

    private static void startGame(int[] arr, int[][] game) {
        int point = 0;

        int[][] newTile = new int[n][n];

        for (int i = 0; i < k; i++) {
            int line = arr[i];
            for (int j = 0; j < n; j++) {
                int target = game[line][j];
                if (target > 0) {

                    if (target >= 10) { // 이벤트
                        point += game[line][j];
                        game[line][j] = 0;
                    } else if (attack[i] >= target) { // 점수


                        point += newTile[line][j] == 0 ? source[line][j] : newTile[line][j];
                        newTile[line][j] = game[line][j] = 0;

                        for (int[] dir : dirs) {
                            int x = line + dir[0];
                            int y = j + dir[1];

                            if (x < 0 || y < 0 || x >= n || y >= n || game[x][y] != 0) {
                                continue;
                            }

                            newTile[x][y] = game[x][y] = source[line][j] / 4;
                        }



                    } else { // 체력만 깎임
                        game[line][j] -= attack[i];
                    }
                    break;
                }
            }
        }
        result = Math.max(result, point);
    }
}