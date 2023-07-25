package BaekjoonOnline.No;

import java.io.*;

public class No_2485_가로수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] trees = new int[N];
        int[] gaps = new int[N - 1];

        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(br.readLine());

            if (i > 0) {
                gaps[i - 1] = trees[i] - trees[i - 1];
            }
        }

        for (int i = 0; i <= gaps.length - 2; i++) {
            gaps[i + 1] = gcd(gaps[i], gaps[i + 1]);
        }

        int gap = gaps[gaps.length - 1];

        System.out.println((trees[N - 1] - trees[0]) / gap - (N - 1));
    }

    private static int gcd(int a, int b) {
        while (b > 0) {
            int tmp = a;

            a = b;
            b = tmp % b;
        }
        return a;
    }
}

