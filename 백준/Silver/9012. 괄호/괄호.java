import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String[] bracket = bf.readLine().split("");
            Stack<String> stack = new Stack<>();
            String result = "YES";
            for (String s : bracket) {
                if (s.equals("(")) {
                    stack.push(s);
                } else {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    } else {
                        result = "NO";
                    }
                }
            }
            if (!stack.isEmpty()) {
                result = "NO";
            }
            sb.append(result);
            if (i != N - 1) {
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}