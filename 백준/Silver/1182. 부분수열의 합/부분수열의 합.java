import java.io.*;

class Main {
    static int[] num;
    private static int N; // 정수의 개수
    private static int S; // 정수의 합
    private static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] firstLine = br.readLine().split(" ");
        N = Integer.parseInt(firstLine[0]);
        S = Integer.parseInt(firstLine[1]);
        
        num = new int[N];
        String[] numbers = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(numbers[i]);
        }
        
        dfs(0, 0);
        if (S == 0) System.out.println(answer - 1); 
        else System.out.println(answer);
    }

    private static void dfs(int depth, int sum) {
        if (depth == N) {
            if (sum == S) answer++;
            return;
        }
        dfs(depth + 1, sum + num[depth]);
        dfs(depth + 1, sum); 
    }
}