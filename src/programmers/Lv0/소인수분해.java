package programmers.Lv0;

import java.util.*;

public class 소인수분해 {
    public static void main(String[] args) {

        int n = 12;
        System.out.println(Arrays.toString(solution(n)));	//[2, 3]

        n = 17;
        System.out.println(Arrays.toString(solution(n)));	//[17]

        n = 420;
        System.out.println(Arrays.toString(solution(n)));	//[2, 3, 5, 7]

    }

    public static int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        int i = 2;

        while (n >= 2) {
            if (n % i == 0) {
                list.add(i);
                n /= i;
            } else {
                i++;
            }
        }
        int[] answer = list.stream().distinct().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
