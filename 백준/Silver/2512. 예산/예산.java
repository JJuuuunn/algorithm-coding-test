import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int arr[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        long M = Long.parseLong(br.readLine());
        int l = 0;
        int r = arr[N - 1];
        while (l <= r) {
            int m = (l + r) / 2;
            long sum = 0;
            for (int num : arr) {
                if (num >= m) sum += m;
                else sum += num;
            }

            if (sum <= M) {
                l = m + 1;
            }
            else r = m - 1;
        }
        System.out.println(r);
    }
}