package ProgrammersSchool.Java.Lv0;

public class 종이_자르기 {
    public static void main(String[] args) {
        int M = 2;
        int N = 2;
        System.out.println(solution(M, N));    //3

        M = 2;
        N = 5;
        System.out.println(solution(M, N));    //9

        M = 1;
        N = 1;
        System.out.println(solution(M, N));    //0
    }

    public static int solution(int M, int N) {
        return M * N - 1;
    }
    // 뭐지...... 이렇게 풀라고 만든게 아닐건데...
}
