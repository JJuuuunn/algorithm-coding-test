import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long total = 0l;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            int h = Integer.parseInt(br.readLine());

            while (!stack.isEmpty() && (stack.peek() <= h)) {
                stack.pop();
            }
            stack.push(h);
            total += stack.size() - 1;
        }

        System.out.println(total);
    }
}