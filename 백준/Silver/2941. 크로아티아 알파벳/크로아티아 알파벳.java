import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        str = str.replaceAll("c=|c-|dz=|d-|lj|nj|s=|z=", " ");

        System.out.println(str.length());
    }
}