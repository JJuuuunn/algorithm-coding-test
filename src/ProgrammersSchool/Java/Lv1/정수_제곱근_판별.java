package ProgrammersSchool.Java.Lv1;

public class 정수_제곱근_판별 {
    public static void main(String[] args) {
        long n = 121;
        System.out.println(solution(n)); // 144

        n = 3;
        System.out.println(solution(n)); // -1
    }

    public static long solution(long n) {
        int num = (int) Math.sqrt(n);
        return Math.pow(num, 2) == n ? (long) Math.pow(num + 1, 2) : -1;
        /*
        처음에 Math 클래스 생각도 하지 못하고
        무식하게 반복문으로 1 * 1, 2 * 2, 3 * 3 하여 n과 비고햇엇다......
        반성하도록 하자.
         */
    }
}