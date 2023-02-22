package ProgrammersSchool.Java.Lv1;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.IntStream;

public class 같은_숫자는_싫어 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        System.out.println(Arrays.toString(solution(arr))); // [1, 3, 0, 1]

        arr = new int[]{4, 4, 4, 3, 3};
        System.out.println(Arrays.toString(solution(arr))); // [4, 3]
    }

    private static int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        for (int num : arr) {
            if (stack.size() == 0) {
                stack.push(num);
            }
            if (!stack.peek().equals(num)) {
                stack.push(num);
            }
        }

        int[] answer = new int[stack.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[answer.length - i - 1] = stack.pop();
        }

        return answer;
    }
}
