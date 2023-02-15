package ProgrammersSchool.Java.Lv2;

import java.util.Arrays;

public class JadenCase_문자열_만들기 {
    public static void main(String[] args) {
        String s = "3people unFollowed me";
        System.out.println(solution(s)); // "3people Unfollowed Me"

        s = "for the last week";
        System.out.println(solution(s)); // "For The Last Week"

        s = "for the  last week";
        System.out.println(solution(s)); // "For The Last Week"
    }

    public static String solution(String s) {
        String answer = "";

        String[] sArr = s.split(" ");
        System.out.println(Arrays.toString(sArr));
        for (String str : sArr) {
            if(str.length() == 0) answer += " ";
            else {
                answer += str.substring(0, 1).toUpperCase();
                answer += str.substring(1, str.length()).toLowerCase();
                answer += " ";
            }
        }
        return answer.substring(0, answer.length()-1);
        /*
            단어 사이에 공백이 한개가 아닌 둘 이상 들어가는 경우를 생각해야한다.
            문장 끝에 공백이 들어가는 경우도 생각해야한다.
        */
        /*
        아래 코드는 다른 사람 풀이에 더 간결하고 보기 쉬운 코드가 있어서 따라했다.
        공백단위가 아닌 한 글자 단위로 끊어서 공백이 오면
        다음에 오는 글자는 대문자로 바꾸게끔하여 공백이 제거될 걱정을 안해도 된다.
        String answer = "";

        String[] sArr = s.toLowerCase().split("");
        boolean check = true;
        for (String str : sArr) {
            answer += (check ? str.toUpperCase() : str);
            check = (str.equals(" ") ? true : false);
        }
        return answer;
         */
    }
}