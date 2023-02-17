package ProgrammersSchool.Java.Lv2;

import java.util.stream.Stream;

public class 최댓값과_최솟값 {
    public static void main(String[] args) {
        String s = "1 2 3 4";
        System.out.println(solution(s)); // "1 4"
        s = "-1 -2 -3 -4";
        System.out.println(solution(s)); // "-4 -1"
        s = "-1 -1";
        System.out.println(solution(s)); // "-1 -1"
    }

    private static String solution(String s) {
        String answer = "";

        int[] sArr = Stream.of(s.split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        answer += sArr[0] + " " + sArr[sArr.length - 1];

        return answer;
    }
}
