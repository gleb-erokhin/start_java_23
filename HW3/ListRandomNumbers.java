package HW.HW3;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Пусть дан произвольный список целых чисел, удалить из него чётные числа
 */
public class ListRandomNumbers {
    public static void main(String[] args) {
        int arraySize = 10; // переменная для количества элементов массива
        ArrayList<Integer> myArray = new ArrayList<>(10);
        for (int i = 0; i < arraySize; i++) {
            // наполним в цикле случайными данными
            myArray.add((int) (Math.random() * 100));
        }
        System.out.printf("Наполним массив случайными числами = ");
        System.out.print(myArray);
        // создаем итератор для прохода по массиву
        Iterator<Integer> myArrayIter = myArray.iterator();
        // в цикле по условию проходимся по массиву пока есть данные, и удаляем четные
        // значения
        while (myArrayIter.hasNext()) {
            if (myArrayIter.next() % 2 == 0)
                myArrayIter.remove();
        }
        System.out.printf("\nУдалим из массива чётные числа = ");
        System.out.print(myArray);
    }
}
