import java.util.*;

class Solution {
    public int[] solution(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] sArr = s.split("");
        int[] answer = new int[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            if (map.containsKey(sArr[i])) {
                answer[i] = i - map.get(sArr[i]);
            } else {
                answer[i] = -1;
            }
            map.put(sArr[i], i);
        }
        return answer;
    }
}