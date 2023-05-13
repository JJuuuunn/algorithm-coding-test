import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long n = Long.parseLong(br.readLine());

        System.out.println(fac(n));
    }

    private static Long fac(Long n) {
        if (n < 2) {
            return 1l;
        }
        return n * fac(n - 1);
    }
}