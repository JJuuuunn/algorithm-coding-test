import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(bf.readLine());

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            String s = st.nextToken();
            String move = st.nextToken();
            if (move.equals("leave")) {
                if (set.contains(s)) {
                    set.remove(s);
                }
            } else {
                set.add(s);
            }
        }

        List<String> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());

        for (String s : list) {
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
}