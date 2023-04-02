package HW.HW4;

/*
 * Реализуйте очередь с помощью LinkedList со следующими методами:
    • enqueue() — помещает элемент в конец очереди,
    • dequeue() — возвращает первый элемент из очереди и удаляет его,
    • first() — возвращает первый элемент из очереди, не удаляя.
 */
import java.util.LinkedList;
// import java.util.Queue;
import java.util.Random;

public class linkedListQueue {
    public static void main(String[] args) {
        LinkedList<Integer> data = addData();
        System.out.println("Исходный массив = " + data);
        first(data);
        dequeue(data);
        enqueue(data);
    }

    static LinkedList<Integer> addData() {
        // метод наполнения массива случайными числами
        LinkedList<Integer> resultList = new LinkedList<>();
        int size = 11;
        Random rnd = new Random();
        for (int i = 1; i < size; i++) {
            resultList.add(rnd.nextInt(8) * i);
        }
        return resultList;
    }

    static void first(LinkedList<Integer> data) {
        System.out.println();
        System.out.println("Метод first");
        System.out.print("Первый элемент из очереди выводим и оставляем в коллекции: ");
        System.out.print(data.peek() + " " + "\n");
        System.out.println(data);
        // }
    }

    static void dequeue(LinkedList<Integer> data) {
        System.out.println();
        System.out.println("Метод dequeue");
        System.out.print("Первый элемент из очереди с удалением из коллекции: ");
        System.out.print(data.poll() + " " + "\n");
        System.out.println(data);
        // }
    }

    static void enqueue(LinkedList<Integer> data) {
        int numm = 10;
        data.addLast(numm);
        System.out.println();
        System.out.println("Метод enqueue");
        System.out.printf("Добавление элемента = %d в конец очереди: \n", numm);
        System.out.println(data);
        // }
    }
}
