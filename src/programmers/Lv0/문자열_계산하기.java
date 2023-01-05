package programmers.Lv0;

public class 문자열_계산하기 {
    public static void main(String[] args) {
        String my_string = "3 + 4";
        System.out.println(solution(my_string));    //7
    }

    public static int solution(String my_string) {
        String[] strArr = my_string.split(" ");
        int answer = Integer.parseInt(strArr[0]);

        for (int i = 1; i < strArr.length; i = i + 2) {
                answer = strArr[i].equals("+") ? (answer + Integer.parseInt(strArr[i + 1])) : (answer - Integer.parseInt(strArr[i + 1]));
        }
        return answer;
    }
}
