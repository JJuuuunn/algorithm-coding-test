import java.util.*;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int lenArr1 = arr1.length;
        int lenArr2 = arr2.length;
        
        // 배열의 길이가 다를 경우, 길이를 비교하여 반환
        if (lenArr1 != lenArr2) {
            return Integer.compare(lenArr1, lenArr2);
        } else {
            // 배열의 길이가 같은 경우, 각 배열의 합을 비교
            int sumArr1 = Arrays.stream(arr1).sum();
            int sumArr2 = Arrays.stream(arr2).sum();
            
            return Integer.compare(sumArr1, sumArr2);
        }
    }
}