package org.example.task1;

/**
 * Написать класс Калькулятор (необобщенный), который содержит
 * обобщенные статические методы: sum(), multiply(), divide(), subtract().
 * Параметры этих методов – два числа разного типа,
 * над которыми должна быть произведена операция.
 */
public class Calc{
    public static <T extends Number> double sum(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    public static <T extends Number> double multiply(T num1, T num2) {
        return num1.doubleValue() * num2.doubleValue();
    }

    public static <T extends Number> double divide(T num1, T num2) {
        if (num2.doubleValue() == 0) {
            throw new ArithmeticException("Ошибка делить на ноль нельзя");
        }
        return num1.doubleValue() / num2.doubleValue();
    }

    public static <T extends Number> double subtract(T num1, T num2) {
        return num1.doubleValue() - num2.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println(sum(5.1, 19));
        System.out.println(multiply(5, 3.6));
        System.out.println(divide(598.1, 2.5));
        System.out.println(subtract(45.1, 1.5));
    }
}