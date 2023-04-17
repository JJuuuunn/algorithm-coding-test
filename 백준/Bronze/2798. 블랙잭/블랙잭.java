import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int arrLength = Integer.parseInt(st.nextToken());
        int maximum = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine());
        int[] cards = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        bf.close();

        int answer = 0;
        for (int i = 0; i < arrLength - 2; i++) {
            for (int j = i + 1; j < arrLength - 1; j++) {
                for (int k = j + 1; k < arrLength; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if (sum == maximum) {
                        answer = sum;
                    }
                    if (answer < sum && sum < maximum) {
                        answer = sum;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}