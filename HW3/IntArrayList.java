package HW.HW3;

/*
 * Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
 */
public class IntArrayList {
    public static void main(String[] args) {
        int[] arr = new int[] { 2, 6, 8, 10, 9, 5, 41, 60, 32 };
        int maxy = arr[0];
        int mini = arr[0];
        int summ = 0;
        for (int i : arr) {
            if (i > maxy)
                maxy = i;
            if (i < mini)
                mini = i;
            summ = summ + i;
        }
        System.out.printf("Максимальное значение массива: %d\n", maxy);
        System.out.printf("Минимальное значение массива: %d\n", mini);
        System.out.printf("Среднее значение массива: %d\n", (summ / arr.length));

    }
}
