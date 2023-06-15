import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        List<Integer> nBook = new ArrayList<>();
        List<Integer> pBook = new ArrayList<>();
        int nMax = 0;
        int pMax = 0;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num < 0) {
                nBook.add(num);
                nMax = Math.min(nMax, num);
            }
            else {
                pBook.add(num);
                pMax = Math.max(pMax, num);
            }
        }

        int max = Math.max(pMax, -nMax);

        Collections.sort(nBook);
        Collections.sort(pBook, Collections.reverseOrder());

        int total = 0;


        while (true) {
            int nNum = 0;
            int pNum = 0;
            for (int i = 0; i < M; i++) {
                // 낮은수에서 0까지 올라가기
                if (!nBook.isEmpty()) nNum = Math.min(nNum, nBook.remove(0));
                // 높은수에서 0까지 내려가기
                if (!pBook.isEmpty()) pNum = Math.max(pNum, pBook.remove(0));
            }
            total += (pNum - nNum) * 2;
            if (nBook.isEmpty() && pBook.isEmpty()) break;
        }
        System.out.println(total - max);
    }
}
