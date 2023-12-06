import java.io.*;

public class Main {
    static long cntFib = 0;
    static int cntFibonacci = 0;

    static int[] dp = new int[41];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp[0] = 1;
        dp[1] = 1;

        fib(n);
        fibonacci(n);

        System.out.println(cntFib);
        System.out.println(cntFibonacci);
    }

    private static int fibonacci(int n) {
        for (int i = 2; i < n; i++) {
            dp[n] = dp[n - 1] + dp[n - 2];
            cntFibonacci++;
        }
        return dp[n - 1];
    }


    private static int fib(int n) {
        if (n > 2) return (fib(n - 1) + fib(n - 2));
        else {
            cntFib++;
            return 1;
        }
    }
}