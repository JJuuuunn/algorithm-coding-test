import java.util.*;

class Solution {
    public Integer[] solution(int[] numList, int n) {
        return Arrays.stream(numList).boxed().limit(n).toArray(Integer[]::new);
    }
}
