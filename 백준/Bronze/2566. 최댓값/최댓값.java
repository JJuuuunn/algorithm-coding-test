import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][] arr = new int[9][9];

    public static void main(String[] args) throws IOException {
        arrPutNum();

        int maxNum = Integer.MIN_VALUE;
        int[] maxNumIndex = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (maxNum < arr[i][j]) {
                    maxNum = arr[i][j];
                    maxNumIndex = new int[]{i + 1, j + 1};
                }
            }
        }

        System.out.println(maxNum);
        System.out.println(maxNumIndex[0] + " " + maxNumIndex[1]);
    }

    private static void arrPutNum() throws IOException {
        for (int i = 0; i < arr.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }
}
