import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        

        if (n < 100) {
            System.out.println(n);
        } else {
            int cnt = 99;
            for (int i = 100; i <= n; i++) {
                int a = i / 100;
                int b = (i / 10) % 10;
                int c = i % 10;

                if ((a - b) == (b - c)) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}