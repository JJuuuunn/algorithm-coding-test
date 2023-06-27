import java.io.*;
import java.util.*;

public class Main {
    static HashMap<Long, Long> map = new HashMap<>();
    static long P, Q;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Long.parseLong(st.nextToken());
        P = Long.parseLong(st.nextToken());
        Q = Long.parseLong(st.nextToken());

        System.out.println(무한수열(N));
    }

    private static long 무한수열(long N) {
        if (N == 0) return 1;
        if (map.containsKey(N)) return map.get(N);
        map.put(N, 무한수열(N / P) + 무한수열(N / Q));
        return map.get(N);
    }
}