import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n];
        
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int[] sortArr = arr.clone();
        Arrays.sort(sortArr);
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        for (int num : sortArr) {
            if (!map.containsKey(num)) {
                map.put(num, cnt);
                cnt++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(map.get(num)).append(" ");
        }
        System.out.println(sb);
    }
}