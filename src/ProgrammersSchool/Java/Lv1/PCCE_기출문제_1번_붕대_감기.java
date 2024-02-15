package ProgrammersSchool.Java.Lv1;

import java.io.IOException;

public class PCCE_기출문제_1번_붕대_감기 {
    public static void main(String[] args) throws IOException {
        int[] bandage = {5, 1, 5};
        int health = 30;
        int[][] attacks = {{2, 10}, {9, 15}, {10, 5}, {11, 5}};
        System.out.println(solution(bandage, health, attacks) == 5 ? "정답" : "실패");

        bandage = new int[]{3, 2, 7};
        health = 20;
        attacks = new int[][]{{1, 15}, {5, 16}, {8, 6}};
        System.out.println(solution(bandage, health, attacks) == -1 ? "정답" : "실패");
    }

    public static int solution(int[] bandage, int health, int[][] attacks) {

        int maxHealth = health;
        int time = 0;
        for (int[] attack : attacks) {
            int attackTime = attack[0];
            int damage = attack[1];

            if (health < maxHealth) {
                health = Math.min(maxHealth, health + (bandage[1] * (attackTime - time - 1) + ((attackTime - time - 1) / bandage[0]) * bandage[2]));
            }
            time = attackTime;
            health -= damage;
            if (health <= 0) {
                return -1;
            }
        }
        return health;
    }
}
