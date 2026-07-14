package by.lessons.practics.class9;

import java.util.List;

public class AvgWithRunnable implements Runnable{
    List<Integer> numbers;

    public AvgWithRunnable(List<Integer> numbers) {
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
