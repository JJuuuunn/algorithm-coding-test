package ProgrammersSchool.Java.Lv2;

import java.util.Arrays;

public class 이진_변환_반복하기 {
    public static void main(String[] args) {
        String s = "110010101001";
        System.out.println(Arrays.toString(solution(s))); // [3, 8]
        s = "01110";
        System.out.println(Arrays.toString(solution(s))); // [3, 3]
        s = "1111111";
        System.out.println(Arrays.toString(solution(s))); // [4, 1]
    }

    private static int[] solution(String s) {
        int[] answer = new int[2];
        String str = "";
        int removeZero = 0;
        int afterRemoveLength = 0;

        do {
            str = s.replaceAll("0", "");
            afterRemoveLength = str.length();
            removeZero = s.length() - afterRemoveLength;

            answer[0]++;
            answer[1] += removeZero;

            s = Integer.toString(afterRemoveLength, 2);
        } while (!s.equals("1"));

        return answer;
    }
}
