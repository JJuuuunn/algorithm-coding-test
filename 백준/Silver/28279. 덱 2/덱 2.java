import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        Deque deque = new LinkedList();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(bf.readLine());
            String cmd = st.nextToken();

            if (cmd.equals("1")) {
                deque.addFirst(st.nextToken());
            } else if (cmd.equals("2")) {
                deque.addLast(st.nextToken());
            } else if (cmd.equals("3")) {
                sb.append(deque.isEmpty() ? -1 : deque.pollFirst()).append("\n");
            } else if (cmd.equals("4")) {
                sb.append(deque.isEmpty() ? -1 : deque.pollLast()).append("\n");
            } else if (cmd.equals("5")) {
                sb.append(deque.size()).append("\n");
            } else if (cmd.equals("6")) {
                sb.append(deque.isEmpty() ? 1 : 0).append("\n");
            } else if (cmd.equals("7")) {
                sb.append(deque.isEmpty() ? -1 : deque.peekFirst()).append("\n");
            } else if (cmd.equals("8")) {
                sb.append(deque.isEmpty() ? -1 : deque.peekLast()).append("\n");
            }
        }
        System.out.println(sb);
    }
}
