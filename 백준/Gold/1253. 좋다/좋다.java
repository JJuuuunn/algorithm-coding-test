import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            while(true){
                if (left == i) {
                    left++;
                } else if (right == i) {
                    right--;
                } 
                if(left >= right) {
                    break;
                }

                if (arr[i] < arr[left] + arr[right]) {
                    right--;
                } else if (arr[i] > arr[left] + arr[right]) {
                    left++;
                } else if (arr[i] == arr[left] + arr[right]) {
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}
