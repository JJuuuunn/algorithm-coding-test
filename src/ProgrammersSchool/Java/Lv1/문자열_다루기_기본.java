package ProgrammersSchool.Java.Lv1;

public class 문자열_다루기_기본 {
    public static void main(String[] args) {
        String s = "a234";
        System.out.println(solution(s)); // false

        s = "1234";
        System.out.println(solution(s)); // true
    }

    public static boolean solution(String s) {
        boolean answer = false;

        if (4 == s.length() || s.length() == 6) {
            try {
                Integer.parseInt(s);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }

        return answer;
        /*
            정규식 사용한 다른 사람의 풀이
            return (s.length() == 4 || s.length() == 6) ? s.matches("(^[0-9]*$)") : false;
         */
    }
}