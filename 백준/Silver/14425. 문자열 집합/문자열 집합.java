import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cnt = 0;

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(bf.readLine());
        }
        for (int i = 0; i < m; i++) {
            if (set.contains(bf.readLine())) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}