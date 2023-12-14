import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if (m - 45 < 0) {
            m = Math.abs(60 - (45 - m));
            if (h - 1 < 0) h = 23;
            else h--;
        } else m -= 45;
        System.out.printf("%d %d", h, m);
    }
}
