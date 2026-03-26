package Exercises;

import java.util.Scanner;

public class Exercise_05 {
    public static void Solution() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();

        if (a != 0) {
            double x = -b / a;
            System.out.println("Kết quả của phương trình " + a + "x + " + b + "là, x = " + x);
        } else {
            System.out.println("Kết quả của phương trình " + a + "x + " + b + "là, x = " + (-b));
        }
    }
}
