import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        int[] N, M;
        int cnt;
        
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            N = new int[Integer.parseInt(st.nextToken())];
            M = new int[Integer.parseInt(st.nextToken())];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N.length; i++) {
                N[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M.length; i++) {
                M[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(N);
            Arrays.sort(M);

            cnt = 0;
            for (int i = 0; i < N.length; i++) {
                for (int j = 0; j < M.length; j++) {
                    if (N[i] > M[j]) cnt++;
                    else break;
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }
}