import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long N = Long.parseLong(st.nextToken());

        for(int i = 1; i <= N; i++) {
        StringBuilder sb = new StringBuilder();
            for(int j = 0; j < N - i; j++) {
                sb.append(" ");
            }
            for(int j = 0; j < i; j++) {
                sb.append("*");
            }
        System.out.println(sb);
        }
    }
}