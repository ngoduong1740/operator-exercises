package Exercises;

import java.util.Scanner;

public class Exercise_09 {
    public static void Solution() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số tự nhiên trong khoảng 1-5: ");
        int n = scanner.nextInt();

        System.out.print("Cách 1 (dùng if liên tiếp):");
        PrintWithMultiIf(n);
        System.out.print("Cách 2 (dùng if và else if):");
        PrintWithIfAndElseIf(n);
        System.out.print("Cách 1 (dùng if lồng nhau):");
        PrintWithNestedIf(n);
        System.out.print("Cách 1 (dùng switch case):");
        PrintWithSwitchCase(n);
    }

    public static void PrintWithMultiIf(int n) {
        if (n == 1) {
            System.out.println("one");
        }

        if (n == 2) {
            System.out.println("two");
        }

        if (n == 3) {
            System.out.println("three");
        }

        if (n == 4) {
            System.out.println("four");
        }

        if (n == 5) {
            System.out.println("five");
        }
    }

    public static void PrintWithIfAndElseIf(int n) {
        if (n == 1) {
            System.out.println("one");
        } else if (n == 2) {
            System.out.println("two");
        } else if (n == 3) {
            System.out.println("three");
        } else if (n == 4) {
            System.out.println("four");
        } else if (n == 5) {
            System.out.println("five");
        }
    }

    public static void PrintWithNestedIf(int n) {
        if (n == 1) {
            System.out.println("one");
        } else {
            if (n == 2) {
                System.out.println("two");
            } else {
                if (n == 3) {
                    System.out.println("three");
                } else {
                    if (n == 4) {
                        System.out.println("four");
                    } else {
                        if (n == 5) {
                            System.out.println("five");
                        }
                    }
                }
            }
        }
    }

    public static void PrintWithSwitchCase(int n) {
        switch (n) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            default:
                break;
        }
    }
}
