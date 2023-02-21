package ProgrammersSchool.Java.Lv1;

import java.util.stream.LongStream;

public class 콜라츠_추측 {
    public static void main(String[] args) {
        int num = 6;
        System.out.println(solution(num));
    }

    private static int solution(int num) {
        int cnt = 0;

        long n = num;

        while (n != 1) {
            n = (n % 2 == 0) ? n / 2 : (n * 3 + 1);
            cnt++;
            if (cnt == 500) {
                return -1;
            }
        }

        return cnt;
        /*
            num 에 큰수가 들어오면
            이후에 Integer.MAX_VALUE 값을 넘어가는 수가 생성되기 때문에
            long 타입으로 변환 후 알고리즘을 실행하여야 한다.
         */
    }
}
