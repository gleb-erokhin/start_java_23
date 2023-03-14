package HW.HW2;

import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

// import HW.HW1.simple_calc;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;

/*
 Реализовать простой калькулятор
 */
public class simple_calc_loger {
    public static void logCalc(String[] args) throws SecurityException, IOException {
        Logger logger = Logger.getLogger(simple_calc_loger.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.setUseParentHandlers(false); // отключаем вывод в консоль

    }

    // "Метод ввода данных"
    public static void inData(String[] args, Logger logger) throws SecurityException, IOException {
        Scanner scanner = new Scanner(System.in); // объявляем объекта класса сканер для считывания данных
        System.out.print("enter the number one: ");
        int number_a = scanner.nextInt(); // Полученное выражение записываем в переменную 1
        logger.info("Введено первое число");
        System.out.print("enter the number two: ");
        int number_b = scanner.nextInt(); // Полученное выражение записываем в переменную 2
        logger.info("Введено второе число");
        System.out.print("enter the operation + - / *: ");
        String operation = scanner.next(); // Получаем знак выполнения операции
        logger.info("Введен знак операции");
        scanner.close(); // закрываем объект сканер для экономии памяти
        // передаем данные в медод вычисления, после чего выводим ответ
        System.out.println(calc(operation, number_a, number_b, logger));
    }

    // Создаем медод для калькулятора, принимает на вход "метод ввода данных", и два
    // числа
    public static int calc(String operation, int number_a, int number_b, Logger logger) {
        int calc = 0; // объявляем переменную для конечного результата
        // задаем выбор операция для вычисления
        switch (operation) {
            case "+":
                calc = number_a + number_b;
                logger.info("Введен знак операции: +");
                break;
            case "-":
                calc = number_a - number_b;
                logger.info("Введен знак операции: -");
                break;
            case "/":
                calc = number_a / number_b;
                logger.info("Введен знак операции: /");
                break;
            case "*":
                calc = number_a * number_b;
                logger.info("Введен знак операции: *");
                break;
            default:
                System.out.println("Неверная операция, попробуйте снова");
                logger.warning("Ошибка ввода, неверный знак операции, завершение программы");
        }
        return calc;
    }

    public static void main(String[] args, Logger logger) throws SecurityException, IOException {
        inData(args); // вызываем метод ввода данных
        logCalc(args);
    }
}
