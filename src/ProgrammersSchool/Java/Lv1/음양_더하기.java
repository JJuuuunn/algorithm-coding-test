package ProgrammersSchool.Java.Lv1;

public class 음양_더하기 {
    public static void main(String[] args) {
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};
        System.out.println(solution(absolutes, signs));

        absolutes = new int[] {1, 2, 3};
        signs = new boolean[] {false, false, true};
        System.out.println(solution(absolutes, signs));
    }

    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            answer += absolutes[i] * (signs[i] ? 1 : -1);
        }

        return answer;
    }
}
