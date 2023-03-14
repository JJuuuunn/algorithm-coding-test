import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str = bf.readLine().toUpperCase();
        int[] count = new int[26]; // A ~ Z 총 26개

        for (char c : str.toCharArray()) {
            count[c - 'A']++;
        }

        int max = 0;
        char c = ' ';
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 0) {
                continue;
            }
            if (max < count[i]) {
                max = count[i];
                c = (char) (i + 'A');
            } else if (max == count[i]) {
                c = '?';
            }
        }
        System.out.println(c);
    }
}