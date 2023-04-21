import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String pokemon = bf.readLine();
            map.put(pokemon, String.valueOf(i + 1));
            map.put(String.valueOf(i + 1), pokemon);
        }
        for (int i = 0; i < M; i++) {
            String s = bf.readLine();
            sb.append(map.get(s)).append("\n");
        }
        System.out.println(sb);
    }
}