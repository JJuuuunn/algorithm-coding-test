package ProgrammersSchool.Java.Lv1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class 두_개_뽑아서_더하기 {
    public static void main(String[] args) {
        int[] s = {2, 1, 3, 4, 1};
        System.out.println(Arrays.toString(solution(s))); // [2,3,4,5,6,7]

        s = new int[] {5, 0, 2, 7};
        System.out.println(Arrays.toString(solution(s))); // [2,5,7,9,12]
    }

    private static int[] solution(int[] numbers) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                arr.add(numbers[i] + numbers[j]);
            }
        }

        return arr.stream().distinct().sorted().mapToInt(Integer::intValue).toArray();

        /*
            다른 사람의 풀이
            Set 을 사용하여 중복된 값을 제거 하였고,
            Set 에서도 TreeSet 을 사용하여 정렬되게 저장하였다.

            TreeSet<Integer> set = new TreeSet<>();
            for (int i = 0; i < numbers.length - 1; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    set.add(numbers[i] + numbers[j]);
                }
            }
            return set.stream().mapToInt(Integer::intValue).toArray();
         */
    }
}
