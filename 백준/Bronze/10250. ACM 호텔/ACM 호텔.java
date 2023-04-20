import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int h = Integer.parseInt(st.nextToken()); // 층
            int w = Integer.parseInt(st.nextToken()); // 층별 방의 수
            int n = Integer.parseInt(st.nextToken()); // 몇번 째 손님

            if (n % h == 0) {
                sb.append(h);
            } else {
                sb.append(n % h);
            }
            double room = Math.ceil((double)n / (double)h);
            if (room < 10) {
                sb.append("0");
            }
            sb.append((int)room + "\n");
        }
        System.out.println(sb);
    }
}