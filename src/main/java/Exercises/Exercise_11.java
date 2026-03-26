package Exercises;

public class Exercise_11 {
    public static void Solution() {
        System.out.println("Biểu thức phủ định của:");
        System.out.println("a > 0                           --> a <= 0");
        System.out.println("(a > 0) && (b > 0)              --> (a <= 0) || (b <= 0)");
        System.out.println("(a > 0) || (b > 0)              --> (a <= 0) && (b <= 0)");
        System.out.println("((a > 0) || (b > 0)) && (a > b) --> ((a <= 0) && (b <= 0)) || (a <= b)");
        System.out.println("(a > 0) && (b > 0) || (a > b)   --> (a <= 0) || (b <= 0) && (a <= b)");
    }
}
