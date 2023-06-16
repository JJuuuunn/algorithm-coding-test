import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] solution = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            solution[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(solution);

        int l = 0;
        int r = N - 1;

        int min = Integer.MAX_VALUE;
        int lNum = 0;
        int rNum = 0;

        while (l < r) {
            int num = solution[r] + solution[l];
            if (min > Math.abs(num)) {
                min = Math.abs(num);
                lNum = solution[l];
                rNum = solution[r];
            } else {
                if (num > 0) r--;
                else l++;
            }
        }
        System.out.println(lNum + " " + rNum);
    }
}