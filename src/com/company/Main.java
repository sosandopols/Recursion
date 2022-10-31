package com.company;

public class Main {
    static int sum = 0;
    static int index = 1;

    static void recurse(int count) {
        if (count <= 0) return;
        System.out.println(count);
        recurse(--count);
    }

    static void sum() {
        if (index > 5) {
            System.out.println();
            return;
        }
        sum += index++;
        sum();
    }

    static int sum2(int index) {
        if (index > 5)
            return 0;
        return index + sum2(++index);
    }

    static int factorial(int number) {
        if (number == 0 || number == 1)
            return 1;
        return number * factorial(--number);
    }

    public static void main(String[] args) {
        recurse(10);
        System.out.println(factorial(4));
    }
}