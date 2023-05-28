import java.io.*;
import java.util.*;

public class Main {

    static int[][] arr = new int[15][15];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Apartment();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int K = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());

            sb.append(arr[K][N]).append('\n');
        }
        System.out.println(sb);
    }

    private static void Apartment() {
        for (int i = 0; i <= 14; i++) {
            arr[i][1] = 1;
            arr[0][i] = i;
        }

        for (int i = 1; i <= 14 ; i++) { // 1층부터 반복
            for (int j = 2; j <= 14; j++) { // 2호부터 반복
                arr[i][j] = arr[i][j - 1] + arr[i - 1][j];
            }
        }
    }
}