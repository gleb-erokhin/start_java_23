package HW.HW5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class adresBook {
    public static void main(String[] args) {
        System.out.println("Добавить запись");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ФИО");
        String userName = scanner.nextLine();
        System.out.println("Введите номер телефона");
        String phoneNumm = scanner.next();

        ArrayList<String> arrayMap = new ArrayList<>();
        arrayMap.add(phoneNumm);

        HashMap<String, ArrayList<String>> map = new HashMap<>();
        map.put(userName, arrayMap);
        scanner.close();

        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
