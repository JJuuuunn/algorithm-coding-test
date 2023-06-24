import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] score = new int[8];
        for (int i = 0; i < 8; i++) {
            score[i] = Integer.parseInt(br.readLine());
        }

        Integer[] rank = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(rank, Collections.reverseOrder());

        int total = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                if (score[i] == rank[j]) {
                    total += rank[j];
                    sb.append(i + 1 + " ");
                    break;
                }
            }
        }

        System.out.println(total);
        System.out.println(sb);
    }
}