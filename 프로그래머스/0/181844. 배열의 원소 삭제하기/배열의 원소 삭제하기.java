import java.util.*;

class Solution {
    public List solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            boolean exist = false;
            for(int j = 0; j < delete_list.length; j++) {
                if(arr[i] == delete_list[j]) {
                    exist = true;
                }
            }
            if(!exist) {
                answer.add(arr[i]);
            }
        }
        
        return answer;
    }
}