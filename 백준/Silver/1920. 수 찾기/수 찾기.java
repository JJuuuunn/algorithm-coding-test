import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());

        // 배열 n 생성
        int[] arr = new int[n];

        // 배열 n 에 값 담기
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
        }

        // binarySearch 하기 위해 정렬
        Arrays.sort(arr);
        
        int m = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine());

        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (Arrays.binarySearch(arr, num) >= 0) {
                sb.append(1 + "\n");
            } else {
                sb.append(0 + "\n");
            }
        }
        System.out.println(sb);
    }
}