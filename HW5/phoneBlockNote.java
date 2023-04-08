package HW.HW5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
//import java.util.Map;
// import java.util.Map;
import java.util.Map;

/* Реализуйте структуру телефонной книги с помощью HashMap, 
учитывая, что 1 человек может иметь несколько телефонов. */

// import java.util.HashMap;
// import java.util.LinkedList;
// import java.util.Random;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class phoneBlockNote {
    static void menuPrint() {
        /*
         * 1 - добавить запись
         * 2 - посмотреть все записи
         * 3 - поиск по ФИО
         */
        //
        System.out.println("Это телефонная книга, выберите номер меню:");
        System.out.println("1 - добавить запись");
        System.out.println("2 - посмотреть все записи");
        System.out.println("3 - поиск по ФИО");
        System.out.println("4 - удалить запись");
    }

    static void menuChoice(int numMenu, HashMap<String, ArrayList<String>> map) {
        switch (numMenu) {
            case 1:
                addRecord();
                break;
            case 2:
                showRecords(map);
                break;
            case 3:
                findRecord();
                break;
            case 4:
                removeRecords();
                break;
            default:
                System.out.println("Не верный ввод!");
        }

    }

    static HashMap<String, ArrayList<String>> addRecord() {
        // static void addRecord() {

        // добавляем ФИО и номер двумя разными запросами
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
        return map;
    }

    static void showRecords(HashMap<String, ArrayList<String>> map) {
        // показать все записи
        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }

    static void findRecord() {
        System.out.println("Найти запись");
    }

    static void removeRecords() {
        // удалить запись
        System.out.println("Удалить запись");
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        menuPrint();
        while (userInput.hasNext()) {
            menuChoice(userInput.nextInt());
        }
        userInput.close();
    }
}
