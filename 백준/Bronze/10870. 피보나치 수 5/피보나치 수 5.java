import java.io.*;
import java.util.*;

public class Main {

    static int[] arr = new int[20];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;

        System.out.println(피보나치(n));
    }
    private static int 피보나치(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return 피보나치(n - 1) + 피보나치(n - 2);
    }
}