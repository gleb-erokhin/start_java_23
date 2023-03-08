package HW.HW1;

// import java.util.Scanner;

/* 
*+Задано уравнение вида q + w = e, q, w, e >= 0. 
Некоторые цифры могут быть заменены знаком вопроса, 
например 2? + ?5 = 69. 
Требуется восстановить выражение до верного равенства. 
Предложить хотя бы одно решение или сообщить, что его нет.
*/
public class equality_num {
    public static void main(String[] args) {
        System.out.println("Найти цифру под знаком ? в уравнении -> 2? + ?5 = 69");
        for (int i = 0; i < 9; i++) {
            for (int j = i; j < 9; j++) {
                int answer = (20 + i) + ((j * 10) + 5);
                if (answer == 69) {
                    if (i == j) {
                        System.out.println("неизвестная цифра: ");
                        System.out.println(i);
                        break;
                    }
                }
            }
        }
    }
}
