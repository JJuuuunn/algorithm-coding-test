import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // N은 홀수

        int[] indexArr = new int[4000 * 2 + 1];

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            indexArr[num + 4000]++;
            sum += num;

            if (max < num) max = num;
            if (min > num) min = num;
        }
        int count = 0;
        int mode_max = 0;
        boolean flag = false;
        int median = 10000;
        int mode = 10000;

        for(int i = min + 4000; i <= max + 4000; i++) {

            if (indexArr[i] > 0) {
                if (count < (N + 1) / 2) {
                    count += indexArr[i];
                    median = i - 4000;
                }
                if (mode_max < indexArr[i]) {
                    mode_max = indexArr[i];
                    mode = i - 4000;
                    flag = true; 
                } else if (mode_max == indexArr[i] && flag == true) {
                    mode = i - 4000;
                    flag = false;
                }
            }
        }
        System.out.println((int)Math.round((double)sum / N));
        System.out.println(median);
        System.out.println(mode);
        System.out.println(max - min);
    }
}