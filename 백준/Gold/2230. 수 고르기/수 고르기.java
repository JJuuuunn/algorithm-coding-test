import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int p = 0;
        int q = 1;
        int minNum = Integer.MAX_VALUE;

        while (q < N) {
            int num = arr[q] - arr[p];
            if (num < M) {
                q++;
            } else if (num == M) {
                minNum = num;
                break;
            } else {
                minNum = Math.min(num, minNum);
                p++;
            }
        }

        System.out.println(minNum);
    }
}