import java.io.*;
import java.util.*;

public class Main {

    public static boolean[] prime = new boolean[246913];

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int num = Integer.parseInt(bf.readLine());
            if (num == 0) break;
            int cnt = 0;

            getPrime();

            for (int i = num + 1; i <= num * 2; i++) {
                if (!prime[i]) {
                    cnt++;
                }
            }

            System.out.println(cnt);
        }
    }


    private static void getPrime() {
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) continue;
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}
