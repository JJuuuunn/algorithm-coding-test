import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Long[][] arr = new Long[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Long.parseLong(st.nextToken());
            arr[i][1] = Long.parseLong(st.nextToken());
        }

        int cnt = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    Long[] x = arr[i];
                    Long[] y = arr[j];
                    Long[] z = arr[k];
                    if (rightAngle(x, y, z)) {
                        cnt++;
                    }
                }
            }
        }
        bw.write(cnt + "");
        bw.close();
    }

    private static boolean rightAngle(Long[] x, Long[] y, Long[] z) {
//        double xy = Math.pow((x[0] - y[0]), 2) + Math.pow((x[1] - y[1]), 2);
//        double xz = Math.pow((x[0] - z[0]), 2) + Math.pow((x[1] - z[1]), 2);
//        double yz = Math.pow((y[0] - z[0]), 2) + Math.pow((y[1] - z[1]), 2);
        long xy = (x[0] - y[0]) * (x[0] - y[0]) + (x[1] - y[1]) * (x[1] - y[1]);
        long xz = (x[0] - z[0]) * (x[0] - z[0]) + (x[1] - z[1]) * (x[1] - z[1]);
        long yz = (y[0] - z[0]) * (y[0] - z[0]) + (y[1] - z[1]) * (y[1] - z[1]);


        if (xy + xz == yz || xy + yz == xz || xz + yz == xy) {
            return true;
        } else {
            return false;
        }
    }
}