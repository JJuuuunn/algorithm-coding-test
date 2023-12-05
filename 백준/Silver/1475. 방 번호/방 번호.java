import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();

        int cnt = num.length() - num.replace("6", "").replace("9", "").length();
        int result = cnt / 2 + cnt % 2;

        for (int i = 0; i < 9; i++) {
            cnt = 0;
            if (i == 6 || i == 9) continue;
            else cnt = num.length() - num.replace(Integer.toString(i), "").length();
            result = Math.max(result, cnt);
        }
        System.out.println(result);
    }
}