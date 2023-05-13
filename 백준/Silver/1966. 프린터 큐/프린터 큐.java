import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            Queue<int[]> queue = new LinkedList<>();
            int cnt = 0;
            for (int j = 0; j < N; j++) {
                queue.add(new int[]{j, Integer.parseInt(st.nextToken())});
            }

            while (true) {
                int[] now = queue.remove();
                boolean flag = true;

                for (int q[] : queue) {
                    if (q[1] > now[1]) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    cnt++;
                    if (now[0] == M) break;
                } else {
                    queue.add(now);
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }
}