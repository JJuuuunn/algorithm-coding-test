package ProgrammersSchool.Java.Lv1;

public class 숫자_문자열과_영단어 {
    public static void main(String[] args) {
        String s = "one4seveneight";
        System.out.println(solution(s)); // 1478

        s = "23four5six7";
        System.out.println(solution(s)); // 234567

        s = "2three45sixseven";
        System.out.println(solution(s)); // 234567

        s = "123";
        System.out.println(solution(s)); // 123

    }

    private static int solution(String s) {
        int answer = 0;
        String[] arr = s.split("");
        String word = "";
        for (String str : arr) {
            try {
                answer = (answer * 10) + Integer.parseInt(str);
            } catch (NumberFormatException e) {
                word += str;
                if (word.equals("zero")) {
                    answer = (answer * 10) + 0;
                } else if (word.equals("one")) {
                    answer = (answer * 10) + 1;
                    word = "";
                } else if (word.equals("two")) {
                    answer = (answer * 10) + 2;
                    word = "";
                } else if (word.equals("three")) {
                    answer = (answer * 10) + 3;
                    word = "";
                } else if (word.equals("four")) {
                    answer = (answer * 10) + 4;
                    word = "";
                } else if (word.equals("five")) {
                    answer = (answer * 10) + 5;
                    word = "";
                } else if (word.equals("six")) {
                    answer = (answer * 10) + 6;
                    word = "";
                } else if (word.equals("seven")) {
                    answer = (answer * 10) + 7;
                    word = "";
                } else if (word.equals("eight")) {
                    answer = (answer * 10) + 8;
                    word = "";
                } else if (word.equals("nine")) {
                    answer = (answer * 10) + 9;
                    word = "";
                }
            }
        }
        return answer;
        /*
            다른 사람의 풀이
            String 배열에 0 ~ 9 까지의 영단어를 넣어놓고 index 값으로 replaceAll 을 사용하여 변환하였다.

            String[] numString = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
            for (int i = 0; i < 10; i++) {
                s = s.replaceAll(numString[i], String.valueOf(i));
            }
            return Integer.valueOf(s);
        */
    }
}
