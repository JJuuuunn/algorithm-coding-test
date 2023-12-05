import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] x = new int[M];
        for (int i = 0; i < M; i++) {
            x[i] = Integer.parseInt(st.nextToken());
        }

        int l = 1;
        int r = N;
        int result = 0;

        while(l <= r) {
            int mid = (l + r) / 2;

            int point = 0;
            for (int i = 0; i < x.length; i++) {
                if (x[i] - mid <= point) point = x[i] + mid;
            }

            if (N > point) l = mid + 1;
            else {
                result = mid;
                r = mid - 1;
            }
        }
        System.out.println(result);
    }
}