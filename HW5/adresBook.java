package HW.HW5;

import java.lang.Thread.State;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class adresBook {
    public static void main(String[] args) {
        inData(args);

    }

    public static void inData(String[] args) {
        System.out.println("Добавить запись");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ФИО");
        String userName = scanner.nextLine();
        System.out.println("Введите номер телефона");
        String phoneNumm = scanner.next();
        scanner.close();

        System.out.println(myArray(userName, phoneNumm));
    }

    static void myArray(String userName, String phoneNumm) {
        ArrayList<String> arrayMap = new ArrayList<>();
        arrayMap.add(phoneNumm);

        HashMap<String, ArrayList<String>> map = new HashMap<>();
        map.put(userName, arrayMap);

        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
