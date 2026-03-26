package Exercises;

import java.util.Scanner;

public class Exercise_03 {
    public static void Solution() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào 1 số nguyên: ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " là số chẵn.");
        } else {
            System.out.println(n + " là số lẻ.");
        }
    }
}
