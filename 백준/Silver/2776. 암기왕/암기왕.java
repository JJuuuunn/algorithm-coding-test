import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] NArr = new int[N];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                NArr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(NArr);

            int M = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < M; j++) {
                if (Arrays.binarySearch(NArr, Integer.parseInt(st.nextToken())) >= 0) sb.append("1");
                else sb.append("0");
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}