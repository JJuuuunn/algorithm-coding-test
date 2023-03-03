import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < N; i++) {
            hashSet.add(br.readLine());
        }
        hashSet.stream()
                .sorted()
                .sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);
    }
}