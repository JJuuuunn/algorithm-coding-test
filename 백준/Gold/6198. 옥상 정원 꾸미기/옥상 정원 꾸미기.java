import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long[] apt = new long[N];
        long total = 0l;

        for (int i = 0; i < N; i++) {
            apt[i] = Long.parseLong(br.readLine());
        }

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (apt[i] > apt[j]) {
                    total++;
                } else {
                    break;
                }
            }
        }

        System.out.println(total);
    }
}