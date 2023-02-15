package ProgrammersSchool.Java.Lv2;

import java.util.Stack;

public class 올바른_괄호 {
    public static void main(String[] args) {
        String s = "()()";
        System.out.println(solution(s)); // true

        s = "(())()";
        System.out.println(solution(s)); // true

        s = ")()(";
        System.out.println(solution(s)); // false

        s = "(()(";
        System.out.println(solution(s)); // false
    }

    public static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == '(') {
                stack.push(c);
            } else {
                if (stack.size() == 0) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.size() == 0;
    }
}