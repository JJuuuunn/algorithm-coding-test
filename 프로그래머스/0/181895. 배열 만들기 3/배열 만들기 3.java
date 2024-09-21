class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int n = 0;
        for (int[] temp : intervals) {
            n += temp[1] - temp[0] + 1;
        }
        
        int[] answer = new int[n];
        
        int idx = 0;
        for (int[] temp : intervals) {
            for (int i = temp[0]; i <= temp[1]; i++) {
                answer[idx] = arr[i];
                idx++;
            }
        }
        return answer;
    }
}