import Exercises.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Chọn bài tập 1-12 (nhấn 0 để thoát): ");
            int number = scanner.nextInt();

            if (number == 0) {
                System.out.println("Thoát!");
                break;
            }

            if (number < 1 || number > 12) {
                System.out.println("Vui lòng chọn trong khoảng 1-12.");
                continue;
            }

            switch (number) {
                case 1:
                    Exercise_01.Solution();
                    break;
                case 2:
                    Exercise_02.Solution();
                    break;
                case 3:
                    Exercise_03.Solution();
                    break;
                case 4:
                    Exercise_04.Solution();
                    break;
                case 5:
                    Exercise_05.Solution();
                    break;
                case 6:
                    Exercise_06.Solution();
                    break;
                case 7:
                    Exercise_07.Solution();
                    break;
                case 8:
                    Exercise_08.Solution();
                    break;
                case 9:
                    Exercise_09.Solution();
                    break;
                case 10:
                    Exercise_10.Solution();
                    break;
                case 11:
                    Exercise_11.Solution();
                    break;
                case 12:
                    Exercise_12.Solution();
                    break;
                default:
                    break;
            }
        }

    }
}
