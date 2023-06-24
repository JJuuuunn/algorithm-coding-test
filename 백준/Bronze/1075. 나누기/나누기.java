import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());

        N /= 100;
        N *= 100;

        while (N % F > 0) N++;
        System.out.printf("%02d", N % 100);
    }
}
