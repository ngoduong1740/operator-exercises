package Exercises;

import java.util.Scanner;

public class Exercise_06 {
    public static void Solution() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("Phương trình có 2 nghiệm x1 và x2 là:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);

            System.out.println("Phương trình có nghiệm kép là:");
            System.out.println("x1 = x2 = " + x);
        } else {
            System.out.println("Phương trình vô nghiệm.");
        }
    }
}
