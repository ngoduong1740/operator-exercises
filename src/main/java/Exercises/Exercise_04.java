package Exercises;

import java.util.Scanner;

public class Exercise_04 {
    public static void Solution() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào bán kính của hình tròn: ");
        double r = scanner.nextDouble();

        double area = r * r * Math.PI;
        double circumference = 2 * r * Math.PI;

        System.out.println("Diện tích hình tròn với bán kính " + r + " là: " + area);
        System.out.println("Chu vi hình tròn với bán kính " + r + " là: " + circumference);
    }
}
