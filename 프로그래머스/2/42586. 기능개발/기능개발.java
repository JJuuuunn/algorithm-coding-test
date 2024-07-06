import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] a = new int[progresses.length];
        for (int i = 0; i < progresses.length; i++) {
            a[i] = (100 - progresses[i]) / speeds[i] + ((100 - progresses[i]) % speeds[i] > 0 ? 1 : 0);
        }

        List<Integer> answer = new ArrayList<>();
        int num = a[0];
        int cnt = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] <= num) {
                cnt++;
            } else {
                answer.add(cnt);
                num = a[i];
                cnt = 1;
            }
        }
        answer.add(cnt);

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}