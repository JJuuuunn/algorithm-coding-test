import java.io.*;

public class Main {
	static 	StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb.append(br.readLine());
		String find = br.readLine();

		search(find);

	}

	public static void search(String find) {

		int count = 0;
		int startIndex = 0;
		int find_len = find.length();

		while((startIndex = sb.toString().indexOf(find)) != -1) {
			sb.delete(0, startIndex + find_len);
			count++;
		}

		System.out.println(count);
	}
}