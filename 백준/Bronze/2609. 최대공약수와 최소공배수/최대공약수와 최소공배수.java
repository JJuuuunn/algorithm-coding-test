import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        StringBuilder sb = new StringBuilder();

        int gcd = getGcd(Math.max(N, M), Math.min(N, M));
        sb.append(gcd).append("\n");
        int lcm = N * M / gcd;
        sb.append(lcm);
        System.out.println(sb);
    }

    private static int getGcd(int num1, int num2) {
        int gcd;

        while(num2 > 0) {
            gcd = num1 % num2;
            num1 = num2;
            num2 = gcd;
        }
        return num1;
    }
}