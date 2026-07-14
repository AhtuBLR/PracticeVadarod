package by.lessons.practics.class9;

//1. Создать 5 потоков, каждый из которых вычисляет среднее арифметическое коллекции из 5 случайных целых чисел
// и выводит на экран. Потоки решать двумя способоами через класс Thread и интерфейс Runnable

import java.util.List;

public class AvgNumber extends Thread {
    List<Integer> numbers;

    public AvgNumber(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public void avg() {
        int sum = 0;
       String str = Thread.currentThread().getName();
        for (Integer i : numbers) {
            System.out.println("Поток" + str + "Стартовал");
            try{
                System.out.println("Поток" + str + "работает");
                Thread.sleep(1000);
                sum += i;
            }catch (InterruptedException e){
                throw new RuntimeException("ERRORE");
            }

        }
        System.out.println(sum/numbers.size());
    }


    @Override
    public void run() {
        avg();
    }
}