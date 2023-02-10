package ProgrammersSchool.Java.Lv0;

import java.util.Arrays;

public class 연속된_수의_합 {
    public static void main(String[] args) {

        int num = 3;
        int total = 12;
        System.out.println(Arrays.toString(solution(num, total)));	//[3, 4, 5]

        num = 5;
        total = 15;
        System.out.println(Arrays.toString(solution(num, total)));	//[1, 2, 3, 4, 5]

        num = 4;
        total = 14;
        System.out.println(Arrays.toString(solution(num, total)));	//[2, 3, 4, 5]

        num = 5;
        total = 5;
        System.out.println(Arrays.toString(solution(num, total)));	//[-1, 0, 1, 2, 3]
    }

    public static int[] solution(int num, int total) {
        int[] answer = new int[num];
        int idx = total % num == 0 ? num / 2 : num / 2 - 1 ;


        for (int i = 0; i < num; i++) {
            answer[i] = total / num - idx + i;
        }
        return answer;
    }
}
