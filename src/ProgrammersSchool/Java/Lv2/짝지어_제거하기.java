package ProgrammersSchool.Java.Lv2;

import java.util.Stack;

public class 짝지어_제거하기 {
    public static void main(String[] args) {
        String s = "baabaa";
        System.out.println(solution(s)); // 1

        s = "cdcd";
        System.out.println(solution(s)); // 0
    }

    public static int solution(String s) {
        Stack<Character> stack = new Stack<>();
        char[] sArr = s.toCharArray();
        for (int i = 0; i < sArr.length; i++) {
            if (stack.isEmpty()) {
                stack.push(sArr[i]);
            } else {
                if (stack.peek().equals(sArr[i])) {
                    stack.pop();
                } else {
                    stack.push(sArr[i]);
                }
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}
