package ProgrammersSchool.Java.Lv1;

public class 문자열을_정수로_바꾸기 {
    public static void main(String[] args) {
        String s = "1234";
        System.out.println(solution(s)); // 1234

        s = "-1234";
        System.out.println(solution(s)); // -1234
    }

    public static int solution(String s) {
        if (s.charAt(0) == '-') {
            return Integer.parseInt(s.substring(1, s.length())) * -1;
        }
        return Integer.parseInt(s);
    }
}
