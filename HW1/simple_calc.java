package HW.HW1;

import java.util.Scanner;

/*
 Реализовать простой калькулятор
 */
public class simple_calc {
    public static int calc(String operation, int number_a, int number_b) {
        int calc = 0;
        switch (operation) {
            case "+":
                calc = number_a + number_b;
                return calc;
            case "-":
                calc = number_a - number_b;
                return calc;
            case "/":
                calc = number_a / number_b;
                return calc;
            case "*":
                calc = number_a * number_b;
                return calc;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number one: ");
        int number_a = scanner.nextInt();
        System.out.print("enter the number two: ");
        int number_b = scanner.nextInt();
        System.out.print("enter the operation + - / *: ");
        String operation = scanner.next();
        scanner.close();
        calc(operation, number_a, number_b);
    }
}
