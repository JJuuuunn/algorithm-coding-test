import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String T = br.readLine();

        int SBCount = S.length() - S.replaceAll("B", "").length();
        int L = 0;
        int R = T.length() - 1;
        boolean reverse = false;
        for (int i = S.length(); i < T.length(); i++) {
            if (!reverse) {
                if (T.charAt(R) == 'B') {
                    reverse = !reverse; //t
                }
                R--;
            } else {
                if (T.charAt(L) == 'B') {
                    reverse = !reverse; //f
                }
                L++;
            }
        }

        int ans = 1;
        for (int i = 0; i < S.length(); i++) {
            char cur = reverse ? T.charAt(R--) : T.charAt(L++);

            if (cur != S.charAt(i)) {
                ans = 0;
            }
        }
        System.out.println(ans);
    }
}