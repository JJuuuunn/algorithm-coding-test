package ProgrammersSchool.Java.Lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 자연수_뒤집어_배열로_만들기 {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(Arrays.toString(solution(n))); // {5, 4, 3, 2, 1}
    }

    public static int[] solution(long n) {
        List<Integer> list = new ArrayList<>();
        while (n >= 10) {
            list.add((int) (n % 10));
            n /= 10;
        }
        list.add((int) n);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    /*
        (int) (n % 10) 부분에서 (int) n % 10 으로 해서 계속 안풀렷었다......
        다음번에는 꼼꼼히 묶어야지
     */

}