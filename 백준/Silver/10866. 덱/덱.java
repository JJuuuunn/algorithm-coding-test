import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            String command = st.nextToken(); // 명령어
            int num = 0;

            if (command.contains("push")) {
                num = Integer.parseInt(st.nextToken()); // 숫자
                if (command.contains("front")) {
                    stack.addFirst(num);
                } else if (command.contains("back")) {
                    stack.addLast(num);
                }
            } else {
                if (command.equals("pop_front")) {
                    if (stack.isEmpty()) {
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(stack.pollFirst()).append("\n");
                    }
                } else if (command.equals("pop_back")) {
                    if (stack.isEmpty()) {
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(stack.pollLast()).append("\n");
                    }
                } else if (command.equals("size")) {
                    sb.append(stack.size()).append("\n");
                } else if (command.equals("empty")) {
                    sb.append(stack.isEmpty() ? 1 : 0).append("\n");
                } else if (command.equals("front")) {
                    if (stack.isEmpty()) {
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(stack.peekFirst()).append("\n");
                    }
                } else if (command.equals("back")) {
                    if (stack.isEmpty()) {
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(stack.peekLast()).append("\n");
                    }
                }
            }
        }
        System.out.println(sb);
    }
}