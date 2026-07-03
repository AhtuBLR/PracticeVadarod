package by.lessons.practics.class9;

import java.awt.*;
import java.util.concurrent.ExecutionException;
import java.util.List;

public class MainNumber {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        List<Integer> number1 = List.of(2, 3, 4, 5);
        List<Integer> number2 = List.of(5, 3, 5, 5);
        List<Integer> number3 = List.of(1, 3, 3, 5);
        List<Integer> number4 = List.of(6, 3, 7, 5);
        List<Integer> number5 = List.of(4, 2, 6, 1);


        AvgNumber avgNumber1 = new AvgNumber(number1);
        avgNumber1.setName("One");
        AvgNumber avgNumber2 = new AvgNumber(number2);
        avgNumber2.setName("Two");
        AvgNumber avgNumber3 = new AvgNumber(number3);
        avgNumber3.setName("Three");
        AvgNumber avgNumber4 = new AvgNumber(number4);
        avgNumber4.setName("Four");
        AvgNumber avgNumber5 = new AvgNumber(number5);
        avgNumber1.setName("Five");

        avgNumber1.start();
        avgNumber2.start();
        avgNumber3.start();
        avgNumber4.start();
        avgNumber5.start();

        AvgWithRunnable avg1 = new AvgWithRunnable (number1);
        Thread thread1 = new Thread(avg1);

        AvgWithRunnable avg2 = new AvgWithRunnable (number2);
        Thread thread2 = new Thread(avg1);


        thread1.start();
        thread2.start();
    }

}