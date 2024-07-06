import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        Stack stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(bf.readLine());
            String cmd = st.nextToken();

            if (cmd.equals("1")) {
                stack.push(st.nextToken());
            } else if (cmd.equals("2")) {
                sb.append(stack.empty() ? "-1" : stack.pop()).append("\n");
            } else if (cmd.equals("3")) {
                sb.append(stack.size()).append("\n");
            } else if (cmd.equals("4")) {
                sb.append(stack.empty() ? 1 : 0).append("\n");
            } else if (cmd.equals("5")) {
                sb.append(stack.empty() ? -1 : stack.peek()).append("\n");
            }
        }
        
        System.out.print(sb);
    }
}
