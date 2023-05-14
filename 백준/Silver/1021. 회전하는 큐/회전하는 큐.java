import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> deque = new LinkedList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            deque.offer(i);
        }

        st = new StringTokenizer(br.readLine());
        int cnt = 0;
        for (int i = 0; i < M; i++) {
            int targetNum = Integer.parseInt(st.nextToken());
            int targetNumIdx = deque.indexOf(targetNum);

            int halfIdx = deque.size() / 2;
            if (deque.size() % 2 == 0) halfIdx--;

            if (targetNumIdx <= halfIdx) {
                while (targetNum != deque.getFirst()) {
                    deque.addLast(deque.pollFirst());
                    cnt++;
                }
            } else {
                while (targetNum != deque.getFirst()) {
                    deque.addFirst(deque.pollLast());
                    cnt++;
                }
            }
            deque.removeFirst();
        }
        System.out.println(cnt);
    }
}