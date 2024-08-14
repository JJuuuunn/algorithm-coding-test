import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());  // 첫 번째 숫자: N
        int X = Integer.parseInt(st.nextToken());  // 두 번째 숫자: X

        st = new StringTokenizer(br.readLine());

        StringBuilder result = new StringBuilder();  // 결과를 저장할 StringBuilder

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num < X) {
                result.append(num).append(" ");
            }
        }

        // 마지막에 붙은 공백 제거
        if (result.length() > 0) {
            result.setLength(result.length() - 1);
        }

        System.out.println(result.toString());
    }
}
