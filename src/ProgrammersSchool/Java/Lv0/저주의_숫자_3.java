package ProgrammersSchool.Java.Lv0;

public class 저주의_숫자_3 {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(solution(n)); // 25

        n = 40;
        System.out.println(solution(n)); // 76
    }

    public static int solution(int n) {
        int num = 1;
        for (int i = 0; i < n; i++) {
            num = validation(num) + 1;
        }
        return num - 1;
    }

    public static int validation(int num) {
        if (num % 3 == 0 || String.valueOf(num).contains("3")) {
            return validation(num + 1);
        }
        return num;
    }
}