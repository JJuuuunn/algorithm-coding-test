import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(bf.readLine());
        for (int i = 0; i < T; i++) {
            HashMap<String, Integer> map = new HashMap();
            int n = Integer.parseInt(bf.readLine());
            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(bf.readLine());
                String name = st.nextToken(); // 의미가 없음......
                String type = st.nextToken();
                map.put(type, map.getOrDefault(type, 0) + 1);
            }
            int cases = 1;
            for (int value : map.values()) {
                cases *= value + 1;
            }
            sb.append(cases - 1).append("\n");
        }
        System.out.println(sb);
    }
}