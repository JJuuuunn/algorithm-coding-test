import java.io.*;

public class Main {

    static int money;
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        money = 1000 - Integer.parseInt(br.readLine());

        cnt = 0;
        money(500);
        money(100);
        money(50);
        money(10);
        money(5);
        money(1);
        System.out.println(cnt);
    }

    private static void money (int M) {
        while (money >= M) {
            money -= M;
            cnt++;
        }
    }
}
