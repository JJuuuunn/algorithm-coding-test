package ProgrammersSchool.Java.Lv1;

public class 가운데_글자_가져오기 {
    public static void main(String[] args) {
        String s = "abcde";
        System.out.println(solution(s)); // "c"

        s = "qwer";
        System.out.println(solution(s)); // "we"
    }

    private static String solution(String s) {

        return s.substring((s.length() - 1) / 2, s.length() / 2 + 1);

    }
}
