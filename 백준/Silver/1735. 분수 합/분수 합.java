import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int denominator1 = Integer.parseInt(st.nextToken());
        int numerator1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int denominator2 = Integer.parseInt(st.nextToken());
        int numerator2 = Integer.parseInt(st.nextToken());
        
        int denominator = denominator1 * numerator2 + denominator2 * numerator1;
        int numerator = numerator1 * numerator2;
        
        int gcd = gcd(Math.min(denominator, numerator), Math.max(denominator, numerator));
        
        
        System.out.println(denominator/gcd + " " + numerator/gcd);
    }
    
    private static int gcd(int a, int b) {
        while (b > 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}