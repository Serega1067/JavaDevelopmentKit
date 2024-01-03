package org.example.task3;

/**
 * Напишите обобщенный класс Pair,
 * который представляет собой пару значений разного типа.
 * Класс должен иметь методы getFirst(), getSecond()
 * для получения значений каждого из составляющих пары,
 * а также переопределение метода toString(),
 * возвращающее строковое представление пары.
 */
public class Main {
    public static void main(String[] args) {

        Pair pair = new Pair(new Object(), "Результат");

        System.out.println(pair);
    }
}
