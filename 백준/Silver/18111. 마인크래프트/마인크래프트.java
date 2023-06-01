import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int[][] arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(max, arr[i][j]);
                min = Math.min(min, arr[i][j]);
            }
        }

        int time = Integer.MAX_VALUE;
        int height = 0;
        for (int i = max; i >= min; i--) {
            int t = 0;
            int block = B;
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (arr[j][k] > i) {
                        block += (arr[j][k] - i);
                        t += 2 * (arr[j][k] - i);
                    } else if (arr[j][k] < i) {
                        block -= (i - arr[j][k]);
                        t += (i - arr[j][k]);
                    }
                }
            }
            if (block >= 0 && time > t) {
                height = i;
                time = t;
            }
        }
        System.out.println(time + " " + height);
    }
}