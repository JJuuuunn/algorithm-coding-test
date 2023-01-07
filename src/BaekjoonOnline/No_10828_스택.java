package BaekjoonOnline;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/*
push X: 정수 X를 스택에 넣는 연산이다.
pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 스택에 들어있는 정수의 개수를 출력한다.
empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 */
public class No_10828_스택 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(bf.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            String s = st.nextToken();
            if (s.equals("push")) {
                stack.push(Integer.parseInt(st.nextToken()));
            } else if (s.equals("pop")) {
                if (stack.isEmpty()) {
                    sb.append(-1 + "\n");
                } else {
                    sb.append(stack.pop() + "\n");
                }
            } else if (s.equals("size")) {
                sb.append(stack.size() + "\n");
            } else if (s.equals("empty")) {
                if (stack.isEmpty()) {
                    sb.append(1 + "\n");
                } else {
                    sb.append(0 + "\n");
                }
            } else if (s.equals("top")) {
                if (stack.isEmpty()) {
                    sb.append(-1 + "\n");
                } else {
                    sb.append(stack.peek() + "\n");
                }
            }
        }
        System.out.println(sb);
    }
}
/* 예제 입력 1
14
push 1
push 2
top
size
empty
pop
pop
pop
size
empty
pop
push 3
empty
top
 */
/* 예제 입력 2
7
pop
top
push 123
top
pop
top
pop
 */