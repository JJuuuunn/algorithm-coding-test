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

        int minNum = Integer.MAX_VALUE;
        Arrays.sort(arr);

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                int num = arr[j] - arr[i];
                if (num >= M) {
                    if (num > minNum) {
                        break;
                    } else minNum = Math.min(minNum, num);
                }
            }
        }
        System.out.println(minNum);
    }
}