package ProgrammersSchool.Java.Lv0;

public class 유한소수_판별하기 {
    public static void main(String[] args) {
        int a = 7;
        int b = 20;
        System.out.println(solution(a, b)); // 1

        a = 11;
        b = 22;
        System.out.println(solution(a, b)); // 1

        a = 12;
        b = 21;
        System.out.println(solution(a, b)); // 2
    }

    public static int solution(int a, int b) {
        int gcd = gcd(a, b);

        b /= gcd;

        while (b != 1) {
            if (b % 2 == 0) {
                b /= 2;
            } else if (b % 5 == 0) {
                b /= 5;
            } else {
                return 2;
            }
        }

        return 1;
    }

    public static int gcd(int a, int b) {

        while ( b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }

        return a;
    }
}
