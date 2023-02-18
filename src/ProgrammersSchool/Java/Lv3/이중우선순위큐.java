package ProgrammersSchool.Java.Lv3;

import java.util.*;

public class 이중우선순위큐 {
    public static void main(String[] args) {
        String[] operations = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
        System.out.println(Arrays.toString(solution(operations))); // [0, 0]

        operations = new String[]{"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
        System.out.println(Arrays.toString(solution(operations))); // [333, -45]
    }

    /*
        I 숫자 : 큐에 주어진 숫자를 삽입합니다.
        D  1  : 큐에서 최댓값을 삭제합니다.
        D -1  : 큐에서 최솟값을 삭제합니다.
     */
    public static int[] solution(String[] operations) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // 최솟값 힙
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // 최댓값

        for (String str : operations) {
            if (str.charAt(0) == 'I') {
                minHeap.add(Integer.parseInt(str.split(" ")[1]));
                maxHeap.add(Integer.parseInt(str.split(" ")[1]));
            } else if (!minHeap.isEmpty()) {
                if (str.equals("D 1")) {
                    int num = maxHeap.poll();
                    minHeap.remove(num);
                } else {
                    int num = minHeap.poll();
                    maxHeap.remove(num);
                }
            }
        }

        if (minHeap.isEmpty()) {
            return new int[]{0, 0};
        }
        return new int[]{maxHeap.peek(), minHeap.peek()};
    }
}