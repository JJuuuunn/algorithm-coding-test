import java.io.*;
import java.util.*;

class Main {

    static int[][] dp = new int[30][30];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        int N, M;
        int[][] dp;
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            dp = new int[N + 1][M + 1];
            for (int i = 0; i <= M; i++) dp[1][i] = i;
            for (int i = 2; i <= N; i++)
                for (int j = i; j <= M; j++)
                    for (int k = j; k >= i; k--)
                        dp[i][j] += dp[i - 1][k - 1];
            sb.append(dp[N][M]).append("\n");
        }
        System.out.print(sb);
    }
}