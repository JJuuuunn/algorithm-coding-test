import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        
        HashMap<String, Integer> map = new HashMap<>();
        for (String[] cloth : clothes) {
            map.put(cloth[1], map.getOrDefault(cloth[1], 0) + 1);
        }
        int cases = 1;
        for (int value : map.values()) {
            cases *= value + 1;
        }
        
        answer = cases - 1;
        return answer;
    }
}