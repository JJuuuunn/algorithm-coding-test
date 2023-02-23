package ProgrammersSchool.Java.Lv1;

public class 이상한_문자_만들기 {
    public static void main(String[] args) {
        String s = "try hello world";
        System.out.println(solution(s));

        s = "try   hello world";
        System.out.println(solution(s));

        s = " try   hello   world";
        System.out.println(solution(s));
    }

    /*
        arr[i] 가 공백인 경우를 체크할 때
        .equals 가 아닌 == 을 사용하는 실수가 있었었다.
     */
    private static String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(" ")) {
                idx = 0;
                answer += arr[i];
            } else if (idx % 2 == 0) {
                answer += arr[i].toUpperCase();
                idx++;
            } else {
                answer += arr[i].toLowerCase();
                idx++;
            }
        }
        return answer;
    }
}
