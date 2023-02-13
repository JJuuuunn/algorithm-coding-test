package BaekjoonOnline;

import java.io.*;
import java.util.*;

public class No_11047_동전_0 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0;
        while (k != 0) {
            for (int i = n - 1; i >= 0; i--) {
                while (arr[i] <= k) {
                    k -= arr[i];
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
