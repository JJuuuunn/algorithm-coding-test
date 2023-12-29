import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        HashSet<Integer> set = new HashSet<>();
        String[] input = br.readLine().split(" ");
        for (String num : input) {
            set.add(Integer.parseInt(num));
        }

        int M = Integer.parseInt(br.readLine());
        input = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for (String num : input) {
            sb.append(set.contains(Integer.parseInt(num)) ? 1 : 0).append(" ");
        }

        System.out.println(sb);
    }
}