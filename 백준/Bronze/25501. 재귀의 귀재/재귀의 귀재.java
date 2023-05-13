import java.io.*;
import java.util.*;

public class Main {

    static int[] arr = new int[20];
    static int cnt = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());


        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            cnt = 1;
            int palindrome = isPalindrome(s);
            sb.append(palindrome).append(" ").append(cnt).append("\n");
        }
        System.out.println(sb);
    }

    private static int isPalindrome(String s) {
        return recursion(s.split(""), 0, s.length() - 1);
    }

    private static int recursion(String[] s, int a, int b) {
        if (a >= b) {
            return 1;
        } else if (!s[a].equals(s[b])) {
            return 0;
        } else {
            cnt++;
            return recursion(s, a + 1, b - 1);
        }
    }
}