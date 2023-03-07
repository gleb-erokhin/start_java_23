package HW.HW1;

import java.util.Scanner;

/*
 * Вывести все простые числа от 1 до 1000
 */
public class simple_num {
    public static void main(String[] args) {
        System.out.print("enter the number n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime)
                System.out.println(i);
        }
    }
}
