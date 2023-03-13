import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //N번째 영화
		
		System.out.println(search_N(N));
	}
	static int i = 666;
	static int cnt = 0;
	public static int search_N(int N) {
			if (Integer.toString(i).contains("666")) {
				cnt++;
			}
			if (cnt == N) {
				return i;
			}
			i++;
			return search_N(N);
		}
	}