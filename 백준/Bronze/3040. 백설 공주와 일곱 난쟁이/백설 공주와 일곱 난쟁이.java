import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 9명의 난쟁이들을 입력받아서 배열에 넣는다.
        int[] dwarf = new int[9];
        for (int i = 0; i < 9; i++) {
            dwarf[i] = Integer.parseInt(br.readLine());
        }

        // 9명의 난쟁이들 중 7명을 뽑아서 합이 100이 되는 경우를 찾는다.
        findDwarf(dwarf);
    }

    // 9명의 난쟁이들 중 7명을 뽑아서 합이 100이 되는 경우를 찾는 함수
    private static void findDwarf(int[] dwarf) {
        // 두 개의 난쟁이를 제외하는 반복문
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                int sum = 0;
                // 난쟁이의 합을 계산할 때, i와 j를 제외한 나머지를 더한다.
                for (int k = 0; k < 9; k++) {
                    if (k != i && k != j) {
                        sum += dwarf[k];
                    }
                }
                // 합이 100이면 결과 출력
                if (sum == 100) {
                    for (int k = 0; k < 9; k++) {
                        // 제외한 두 난쟁이를 제외하고 출력
                        if (k != i && k != j) {
                            System.out.println(dwarf[k]);
                        }
                    }
                    return; // 첫 번째 경우를 찾으면 종료
                }
            }
        }
    }
}
