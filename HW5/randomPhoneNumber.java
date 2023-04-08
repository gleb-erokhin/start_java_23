package HW.HW5;

import java.util.LinkedList;
import java.util.Random;

public class randomPhoneNumber {
    public static void main(String[] args) {
        LinkedList<Integer> data = createPhonesNumber();
        String code = "+7555";
        for (Integer integer : data) {
            System.out.printf("%s%s\n", code, integer.toString());
        }
    }

    static LinkedList<Integer> createPhonesNumber() {
        LinkedList<Integer> phones = new LinkedList<>();
        int size = 20;
        int min = 1111111;
        int max = 9999999;
        int diff = max - min;
        Random nums = new Random();
        for (int i = 0; i < size; i++) {
            int numm = nums.nextInt(diff + 1);
            if ((numm % 2 == 0) == (diff % 2 == 0))
                phones.addLast(numm);
        }
        return phones;
    }
}