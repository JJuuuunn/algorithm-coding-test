import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numA = Integer.parseInt(br.readLine());
        int numB = Integer.parseInt(br.readLine());

        int first = numA * (numB % 10);
        int second = numA * ((numB % 100) / 10);
        int third = numA * (numB / 100);
        
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(numA * numB);
    }
}
