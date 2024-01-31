import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length < 2) return new int[]{-1};
        
        return Arrays.stream(arr).filter(x -> x != Arrays.stream(arr).min().getAsInt()).toArray();
    }
}