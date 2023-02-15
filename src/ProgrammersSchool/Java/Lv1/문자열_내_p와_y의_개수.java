package ProgrammersSchool.Java.Lv1;

public class 문자열_내_p와_y의_개수 {
    public static void main(String[] args) {
        String s = "pPoooyY";
        System.out.println(solution(s)); // true

        s = "Pyy";
        System.out.println(solution(s)); // false
    }

    public static boolean solution(String s) {
        String[] sArr = s.toLowerCase().split("");
        int p = 0;
        int y = 0;
        for (String str : sArr) {
            if (str.equals("p")) {
                p++;
            } else if (str.equals("y")) {
                y++;
            }
        }
        return p == y;
    /*
        s = s.toLowerCase();
        return s.chars().filter( e -> 'p'== e).count() == s.chars().filter( e -> 'y'== e).count();

     */
    }
}