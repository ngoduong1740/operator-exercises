package Exercises;

import java.util.Scanner;

public class Exercise_12 {
    public static void Solution() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập vào số nguyên b: ");
        int b = scanner.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Kết quả sau khi đảo giá trị:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
