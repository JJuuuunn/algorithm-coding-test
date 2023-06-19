import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int l = 1;
        int r = 5 * N;

        boolean check = false;
        while (l <= r) {
            int m = (l + r) / 2;
            int zeroNum = factorialZero(m);
            if (zeroNum > N) {
                r = m - 1;
            } else if (N == zeroNum) {
                r = m - 1;
                check = true;
            } else l = m + 1;
        }
        if (check) System.out.println(l);
        else System.out.println(-1);
    }

    private static int factorialZero(int m) {
        int count=0;

        for (int i = 5; i <= m; i *= 5){
            count += (m / i);
        }

        return count;
    }
}