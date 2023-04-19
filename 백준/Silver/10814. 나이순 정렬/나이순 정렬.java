import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String[][] arr = new String[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        StringBuilder sb = new StringBuilder();
        for (String[] person : arr) {
            sb.append(person[0] + " " + person[1]).append("\n");
        }

        System.out.println(sb);
    }
}