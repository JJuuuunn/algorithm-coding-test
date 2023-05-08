import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cnt = n + m;

        StringBuilder sb = new StringBuilder();

        HashSet<String> set = new HashSet<>();
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            set.add(st.nextToken());
        }

        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < m; i++) {
            String s = st.nextToken();
            if (set.contains(s)) {
                cnt -= 2;
            }
        }
        System.out.println(cnt);
    }
}