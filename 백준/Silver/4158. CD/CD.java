import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int m;
    static int cnt;
    static HashSet<Integer> set;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        int m = 0;
        int cnt = 0;
        HashSet<Integer> set = new HashSet<>();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            if (n == 0 && m == 0) {
                break;
            }
            
            set = new HashSet<>();
            cnt = 0;
            
            for (int i = 0; i < n; i++) {
                set.add(Integer.parseInt(br.readLine()));
            }

            for (int i = 0; i < n; i++) {
                int cd = Integer.parseInt(br.readLine());

                if (set.contains(cd)) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}