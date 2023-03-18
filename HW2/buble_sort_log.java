package HW.HW2;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class buble_sort_log {
    private static Logger logger;

    public static void logCalc(String[] args) throws SecurityException, IOException {
        logger = Logger.getLogger(buble_sort_log.class.getName());
        FileHandler fh = new FileHandler("buble_log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.setUseParentHandlers(false); // отключаем вывод в консоль
    }

    private static void BubbleSort(int[] numms, Logger logger) {

        int temp = 0;
        int count = 0;
        String arr = "";

        for (int i = 0; i < numms.length; i++) {
            for (int j = 0; j < numms.length - 1; j++) {
                if (numms[j] > numms[j + 1]) {
                    temp = numms[j];
                    numms[j] = numms[j + 1];
                    numms[j + 1] = temp;
                    count++;
                    String counterOfStep = Integer.toString(count);
                    arr = Arrays.toString(numms);
                    logger.info(" Step " + "(" + counterOfStep + ")" + " Array " + arr
                            + " move (" + numms[j] + ") to (" + numms[j + 1] + ")");
                }
            }
        }
    }

    public static void main(String[] args) throws SecurityException, IOException {
        int[] myArray = new int[] { 2, 5, 9, 6, 4, 1, 8 };
        logCalc(args);
        BubbleSort(myArray, logger);
    }
}
