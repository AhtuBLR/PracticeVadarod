package by.lessons.practics.class10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.concurrent.Callable;

public class CallClass implements Callable<String> {

    public CallClass() {
        Thread.currentThread().setName(String.valueOf(this.hashCode()));
    }

    @Override
    public String call() throws Exception {
        System.out.println("Start" + Thread.currentThread().getName());

        Collection<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add((int) (Math.random() * 100));
        }
        //Thread.sleep((int)(Math.random() * 1000));
        Thread.sleep(1000);

        Optional<Integer> streamSum = numbers.stream().reduce(Integer::sum);
        int sum = streamSum.orElse(-999999999);


        //return String.valueOf(sum);
        return this.hashCode() + ", sum = " + sum;
    }
}
