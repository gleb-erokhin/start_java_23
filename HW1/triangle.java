package HW.HW1;

import java.util.Scanner;

/*
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */
public class triangle {
    public static void main(String[] args) {
        System.out.print("enter the number n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int res_triangle = 1;
        int res_fac = 1;
        for (int i = 1; i <= n; i++) {
            int count_triangle = (i * (i + 1)) / 2;
            int count_fac = i;
            res_triangle = count_triangle;
            res_fac = res_fac * count_fac;
        }
        System.out.printf("Сумма треугольного числа = %d \n", res_triangle);
        System.out.printf("Сумма факториала от 1 до %d = %d \n", n, res_fac);

    }
}
