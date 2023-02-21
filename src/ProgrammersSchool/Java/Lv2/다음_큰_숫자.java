package ProgrammersSchool.Java.Lv2;


public class 다음_큰_숫자 {
    public static void main(String[] args) {
        int n = 78;
        System.out.println(solution(n)); // 83

        n = 15;
        System.out.println(solution(n)); // 23
    }

    // 시간복잡도에서 탈락
    public static int solution(int n) {
        /*
            처음에 n 을 2진법으로 변환 후
            반복문으로 "1"의 갯수를 세는 방식을 사용하였지만
            시간복잡도 부분에 (시간 초과) 라고 통과하지 못하였다.
            두번째로는 split 을 사용해서
            "0"을 제거한후 길이를 가지고 비교를 하였지만
            똑같이 (시간 초과)로 통과하지 못하였다.


            String binaryNum1 = Integer.toBinaryString(n);
            int removeZero1 = binaryNum1.replaceAll("0", "").length();

            while (true) {
                n++;
                String binaryNum2 = Integer.toBinaryString(n);
                int removeZero2 = binaryNum2.replaceAll("0", "").length();
                if (removeZero1 == removeZero2) {
                    return n;
                }
            }
         */

        /*
            Integer 클래스에 bitCount 라는 메소드 라고
            입력받은 숫자를 2진법으로 변환 후
            "1"의 갯수를 세서 리턴하는게 있어서 사용하였다.
         */
        int cntOne1 = Integer.bitCount(n);
        while (true) {
            n++;
            int cntOne2 = Integer.bitCount(n);
            if (cntOne1 == cntOne2) {
                return n;
            }
        }

    }
}
