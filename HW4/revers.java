package HW.HW4;

/*
 * Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.
 */
import java.util.LinkedList;
// import java.util.Random;
import java.util.Random;

public class revers {
    public static void main(String[] args) {
        // вызываем методы наполнения массива и разворота массива
        LinkedList<Integer> data = addData();
        System.out.println("Исходный массив = " + data);
        reverseData(data);
    }

    static LinkedList<Integer> addData() {
        // метод наполнения массива случайными числами
        LinkedList<Integer> resultList = new LinkedList<>();
        int size = 10;
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            resultList.add(rnd.nextInt(6) + i);
        }
        return resultList;
    }

    static void reverseData(LinkedList<Integer> data) {
        // создаем новый список для развернутого массива
        LinkedList<Integer> reverseList = new LinkedList<>();
        int size = 10;
        // разворачиваем массив циклом обратном порядке, добвляя новое число всегда на
        // последнее место
        // for (int i = size - 1; i >= 0; i--) {
        // reverseList.addLast(data.get(i));

        // разворачиваем массив в прямом порядке, добавля новое число всегда на первое
        // место
        for (int i = 0; i < size; i++) {
            reverseList.addFirst(data.get(i));
        }
        System.out.println("Развернутый массив = " + reverseList);
    }
}
