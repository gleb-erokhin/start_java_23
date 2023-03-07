package HW.HW1;

import java.util.Scanner;

/*
 Реализовать простой калькулятор
 */
public class simple_calc {
    // "Метод ввода данных"
    public static void inData(String[] args) {
        Scanner scanner = new Scanner(System.in); // объявляем объекта класса сканер для считывания данных
        System.out.print("enter the number one: ");
        int number_a = scanner.nextInt(); // Полученное выражение записываем в переменную 1
        System.out.print("enter the number two: ");
        int number_b = scanner.nextInt(); // Полученное выражение записываем в переменную 2
        System.out.print("enter the operation + - / *: ");
        String operation = scanner.next(); // Получаем знак выполнения операции
        scanner.close(); // закрываем объект сканер для экономии памяти
        // передаем данные в медод вычисления, после чего выводим ответ
        System.out.println(calc(operation, number_a, number_b));
    }

    // Создаем медод для калькулятора, принимает на вход "метод ввода данных", и два
    // числа
    public static int calc(String operation, int number_a, int number_b) {
        int calc = 0; // объявляем переменную для конечного результата
        // задаем выбор операция для вычисления
        switch (operation) {
            case "+":
                calc = number_a + number_b;
                break;
            case "-":
                calc = number_a - number_b;
                break;
            case "/":
                calc = number_a / number_b;
                break;
            case "*":
                calc = number_a * number_b;
                break;
            default:
                System.out.println("Неверная операция, попробуйте снова");
        }
        return calc;
    }

    public static void main(String[] args) {
        inData(args); // вызываем метод ввода данных
    }
}
