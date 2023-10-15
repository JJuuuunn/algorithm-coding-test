import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = null;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        while(N --> 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            if(n == 0) {
                if(queue.isEmpty()) System.out.println(-1);
                else System.out.println(queue.poll());
            } else {
                while(n --> 0) queue.offer(Integer.parseInt(st.nextToken()));
            }
        }
    }
}
