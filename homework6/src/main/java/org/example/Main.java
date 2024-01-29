package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    static Random random;
    static Map<Integer, Boolean> statPlayerNotChangeChoice;
    static Map<Integer, Boolean> statPlayerChangeChoice;
    static int maxCount;
    static int win;
    static int attempts;

    public static void main(String[] args) {
        random = new Random();
        statPlayerNotChangeChoice = new HashMap<>();
        statPlayerChangeChoice = new HashMap<>();
        maxCount = 3;
        win = 0;
        attempts = 1000;

        System.out.println("Парадокс Монти Холла");

        for (int i = 0; i < attempts; i++) {
            lap(i);
        }

        System.out.println("Статистика для игрока не менявшего свой выбор");

        for (Map.Entry<Integer, Boolean>
                entry: statPlayerNotChangeChoice.entrySet()) {
            if (entry.getValue()) {
                win++;
            }
        }

        System.out.println("Игрок победил " + win + " раз");

        System.out.println("Статистика игрока изменившего свой выбор");
        win = 0;
        for (Map.Entry<Integer, Boolean>
                entry : statPlayerChangeChoice.entrySet()) {
            if (entry.getValue()) {
                win++;
            }
        }

        System.out.println("Игрок победил " + win + " раз");
    }

    private static void lap(int numLap) {
        int success = random.nextInt(maxCount);
        int firstAttempt = random.nextInt(maxCount);
        int freeOpenDoor = -1;
        int secondAttempt = -1;

        statPlayerNotChangeChoice.put(numLap, success == firstAttempt);

        for (int i = 0; i < maxCount; i++) {
            if (i != success && i != firstAttempt) {
                freeOpenDoor = i;
            }
        }

        for (int i = 0; i < maxCount; i++) {
            if (i != freeOpenDoor && i != firstAttempt) {
                secondAttempt = i;
            }
        }

        statPlayerChangeChoice.put(numLap, success == secondAttempt);
    }
}