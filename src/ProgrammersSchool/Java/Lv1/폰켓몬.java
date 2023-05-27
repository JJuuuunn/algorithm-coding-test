package ProgrammersSchool.Java.Lv1;

import java.io.IOException;
import java.util.HashSet;

public class 폰켓몬 {

    static int[][] arr = new int[15][15];

    public static void main(String[] args) throws IOException {

        int[] nums = {3,3,3,2,2,4};

        System.out.println(solution(nums));

    }

    private static int solution(int[] nums) {
        int answer = 0;

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        return nums.length / 2 < set.size() ? nums.length / 2: set.size();
    }
}