import java.io.*;
import java.util.*;

public class Main {

    public static boolean[] prime = new boolean[1000001];

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        get_prime();

        int n = Integer.parseInt(bf.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(bf.readLine());
            int cnt = 0;

            for (int j = 2; j <= num / 2; j++) {
                if (!prime[j] && !prime[num - j]) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }


    private static void get_prime() {
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) continue;
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}
