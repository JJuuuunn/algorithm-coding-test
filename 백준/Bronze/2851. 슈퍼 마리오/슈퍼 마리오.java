import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int score1 = 0;
        int score2 = 0;
        for(int i = 0; i < 10; i++) {
            int mushroom = Integer.parseInt(br.readLine());
            if(score1 < 100){
                score1 += mushroom;
                if(Math.abs(score2 - 100) > Math.abs(score1 - 100)) {
                    score2 = score1;
                } else if(Math.abs(score2 - 100) == Math.abs(score1 - 100)) {
                    score2 = Math.max(score1, score2);
                }
            }
        }
        System.out.println(score2);
    }
}