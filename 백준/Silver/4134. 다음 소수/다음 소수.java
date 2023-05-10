import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            Long num = Long.parseLong(br.readLine());

            BigInteger integer = new BigInteger(String.valueOf(num));

            if (integer.isProbablePrime(10)) {
                System.out.println(num);
            } else {
                System.out.println(integer.nextProbablePrime());
            }
        }
    }
}