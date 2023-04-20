import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        Long[] arr = new Long[N];
        HashMap<Long, Long> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
//            arr[i] = Long.parseLong(st.nextToken());
            Long num = Long.parseLong(st.nextToken());
            map.put(num, map.getOrDefault(num, 0L) + 1);
        }

        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < M; i++) {
            Long num = Long.parseLong(st.nextToken());
//            Long cnt = Arrays.stream(arr).filter(x -> x.equals(num)).count();
//            sb.append(cnt).append(" ");
            sb.append(map.getOrDefault(num, 0L)).append(" ");
        }
        System.out.println(sb);
    }
}