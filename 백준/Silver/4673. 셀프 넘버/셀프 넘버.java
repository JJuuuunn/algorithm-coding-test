import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] number = new int[10001];
        for(int i = 0; i < 10001; i++) {
            int num = notSelfNum(i);
            if (num < 10001) {
                number[num]++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 10001; i++) {
            if (number[i] == 0) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
    
    private static int notSelfNum(int idx) {
        int num = idx;
        while (idx > 0) {
            num += (idx % 10);
            idx /= 10;
        }
        return num;
    }
}