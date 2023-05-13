import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        Queue<Integer> queue = new LinkedList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        int cnt = 0;
        while (true) {
            cnt++;
            int num = queue.poll();
            if (cnt % k != 0) {
                queue.add(num);
            } else {
                sb.append(num);
                if (queue.isEmpty()) {
                    break;
                } else {
                    sb.append(", ");
                }
            }
        }
        sb.append(">");
        System.out.println(sb);
    }
}