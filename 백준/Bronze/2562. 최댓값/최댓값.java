import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int maxNum = 0;
        int maxIdx = -1;
        for (int i = 1; i <= 9; i++) {
            int N = Integer.parseInt(bf.readLine());
            if (maxNum < N) {
                maxNum = N;
                maxIdx = i;
            }
        }
        System.out.println(maxNum);
        System.out.println(maxIdx);
    }
}