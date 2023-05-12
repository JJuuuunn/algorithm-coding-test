import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        int result = fac(n) / (fac(r) * fac(n - r));
        System.out.println(result);
    }

    private static int fac(int n) {
        int num = 1;
        for (int i = n; i >= 1 ; i--) {
            num *= i;
        }
        return num;
    }
}
