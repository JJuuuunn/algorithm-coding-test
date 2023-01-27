package programmers.Lv0;

import java.util.Arrays;

public class 다항식_더하기 {
    public static void main(String[] args) {
        String polynomial = "3x + 7 + x";
        System.out.println(solution(polynomial)); //4x + 7"
        System.out.println(solution2(polynomial)); //4x + 7"

        polynomial = "x + x + x";
        System.out.println(solution(polynomial)); //3x"
        System.out.println(solution2(polynomial)); //3x"
    }
// 흠... 다른 방식으로 한다고 한건데 차이가 없네......
    public static String solution(String polynomial) {
        String answer = "0";

        String[] arr = polynomial.split(" ");

        int x = 0;
        int num = 0;

        if (arr[0].contains("x")) {
            if (arr[0].equals("x")) {
                x = 1;
            } else {
                x = Integer.parseInt(arr[0].replace("x", ""));
            }
        } else {
            num = Integer.parseInt(arr[0]);
        }

        for (int i = 1; i < arr.length; i = i + 2) {
                if (arr[i + 1].contains("x")) {
                    if (arr[i + 1].equals("x")) {
                        x += 1;
                    } else {
                        x += Integer.parseInt(arr[i + 1].replace("x", ""));
                    }
                } else {
                    num += Integer.parseInt(arr[i + 1]);
                }

        }

        if (x == 0) return String.valueOf(num);
        if (num == 0) {
            if (x == 1) {
                return "x";
            }
                return x + "x";
        }
        if (x == 1) {
            return "x + " + num;
        }
        return x + "x + " + num;
    }

    public static String solution2(String polynomial) {
        String answer = "";

        String[] arr = polynomial.split(" ");

        int xNum = 0;
        int num = 0;

        for (String word : arr) {
            if (word.contains("x")) {
                if (word.length() == 1) {
                    xNum += 1;
                } else {
                    xNum += Integer.parseInt(word.replace("x", ""));
                }
            } else if (!word.contains("+")) {
                num += Integer.parseInt(word);
            }
        }

        if (xNum != 0 && num != 0) {
            if (xNum == 1) {
                return "x + " + num;
            } else {
                return xNum + "x + " + num;
            }
        } else if (xNum != 0 && num == 0) {
            if (xNum == 1) {
                return "x";
            } else {
                return xNum + "x";
            }
        } else if (xNum == 0 && num != 0) {
            return String.valueOf(num);
        }
        return answer;
    }
}
