import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);

        int maxCnt = 0;
        for (int num : list) {
            int cnt = 0;
            for (int i = 0; i < 5; i++) {
                if (list.contains(num + i)) {
                    cnt++;
                }
                maxCnt = Math.max(maxCnt, cnt);
            }
        }
        System.out.println(5 - maxCnt);
    }
}