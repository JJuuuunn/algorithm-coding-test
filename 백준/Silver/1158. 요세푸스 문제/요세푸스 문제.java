import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        Queue<Integer> q = new LinkedList<>();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        int cnt = 0;
        sb.append("<");
        while (true) {
            cnt++;
            int num = q.poll();
            if (cnt % K != 0) {
                q.add(num);
            } else {
                sb.append(num);
                if (!q.isEmpty()) {
                    sb.append(", ");
                } else {
                    break;
                }
            }


        }
        sb.append(">");
        System.out.println(sb);
    }
}