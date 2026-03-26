package Exercises;

import java.util.Scanner;

public class Exercise_02 {
    public static void Solution() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào 1 số thực: ");
        double n = scanner.nextDouble();

        System.out.println("Tích của số đã nhập với 2 là: " + (n * 2));
    }
}
