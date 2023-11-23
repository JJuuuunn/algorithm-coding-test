import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        StringBuilder sb = new StringBuilder();
        while (A != 0 && B != 0) {
            sb.append(A + B).append("\n");
            
            st = new StringTokenizer(bf.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
        }

        System.out.println(sb);
    }
}