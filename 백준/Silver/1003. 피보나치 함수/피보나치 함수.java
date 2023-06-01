import java.io.*;
import java.util.*;
public class Main {
    static Integer[][] arr = new Integer[41][2];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        arr[0][0] = 1;
        arr[0][1] = 0;
        arr[1][0] = 0;
        arr[1][1] = 1;

        for (int i = 0; i < T; i++) {
            int num = Integer.parseInt(br.readLine());
            fibonacci(num);
            sb.append(arr[num][0]).append(" ").append(arr[num][1]).append("\n");
        }
        System.out.println(sb);
    }

    private static Integer[] fibonacci(int n) {
        if (arr[n][0] == null || arr[n][1] == null) {
            arr[n][0] = fibonacci(n - 1)[0] + fibonacci(n - 2)[0];
            arr[n][1] = fibonacci(n - 1)[1] + fibonacci(n - 2)[1];
        }
        return arr[n];
    }
}