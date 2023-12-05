import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            String strN = String.valueOf(i);
            cnt += strN.length() - strN.replace("3","")
                    .replace("6", "")
                    .replace("9", "")
                    .length();
        }
        System.out.println(cnt);
    }
}