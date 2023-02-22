package ProgrammersSchool.Java.Lv1;

import java.util.stream.IntStream;

public class 내적 {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        int[] b = {-3, -1, 0, 2};
        System.out.println(solution(a, b)); // 3

        a = new int[] {-1, 0, 1};
        b = new int[] {1, 0, -1};
        System.out.println(solution(a, b)); // -2
    }

    public static int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }

        return answer;
        /*
            배열이 2개라서 stream 을 두번 사용해야되겠네 라고 생각했는데
            다른 사람의 풀이에서 index 값으로 두 배열의 값을 가져와 더하는 방법이 있었다.

            return IntStream.range(0, a.length).map(idx -> a[idx] + b[idx]).sum();
         */
    }
}