import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<int[]> stack = new Stack<>(); // {top, index}
        for (int i = 0; i < N; i++) {
            int top = Integer.parseInt(st.nextToken());
            while (!stack.isEmpty()) {
                if (stack.peek()[0] >= top) {
                    sb.append(stack.peek()[1] + " ");
                    break;
                }
                stack.pop();
            }

            if (stack.isEmpty()) sb.append(0 + " ");
            stack.push(new int[] {top, i + 1});
        }
        System.out.println(sb);
    }
}