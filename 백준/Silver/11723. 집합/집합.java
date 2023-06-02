import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] S = new int[21];

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int num = 0;
            switch (command) {
                case "add" :
                    S[Integer.parseInt(st.nextToken())]++;
                    break;
                case "remove" :
                    num = Integer.parseInt(st.nextToken());
                    if (S[num] > 0) {
                        S[num]--;
                    }
                    break;
                case "check" :
                    if (S[Integer.parseInt(st.nextToken())] > 0) {
                        sb.append("1").append("\n");
                    } else {
                        sb.append("0").append("\n");
                    }
                    break;
                case "toggle" :
                    num = Integer.parseInt(st.nextToken());
                    if (S[num] > 0) {
                        S[num]--;
                    } else {
                        S[num]++;
                    }
                    break;
                case "all" :
                    S = new int[21];
                    for (int j = 1; j <= 20; j++) {
                        S[j]++;
                    }
                    break;
                case "empty" :
                    S = new int[21];
                    break;
            }
        }
        System.out.println(sb);
    }
}