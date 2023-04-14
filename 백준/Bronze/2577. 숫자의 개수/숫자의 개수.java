import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int A = Integer.parseInt(bf.readLine());
        int B = Integer.parseInt(bf.readLine());
        int C = Integer.parseInt(bf.readLine());

        int num = A * B * C;

        String numStr = String.valueOf(num);
        int numLength = numStr.length();
        for (int i = 0; i < 10; i++) {
            int length = numStr.replaceAll(String.valueOf(i), "").length();
            sb.append(numLength - length).append("\n");
        }
        System.out.println(sb);
    }
}