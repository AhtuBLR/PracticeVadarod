package by.lessons.practics.class10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
//        CallClass cclass1 = new CallClass();
//        CallClass cclass2 = new CallClass();
//        CallClass cclass3 = new CallClass();
//        CallClass cclass4 = new CallClass();
//        CallClass cclass5 = new CallClass();
//        CallClass cclass6 = new CallClass();
//        CallClass cclass7 = new CallClass();
//        CallClass cclass8 = new CallClass();
//        CallClass cclass9 = new CallClass();
//        CallClass cclass10 = new CallClass();
//        ExecutorService service1 = Executors.newFixedThreadPool(4);
//        Future<String> future1 = service1.submit(cclass1);
//        Future<String> future2 = service1.submit(cclass2);
//        Future<String> future3 = service1.submit(cclass3);
//        Future<String> future4 = service1.submit(cclass4);
//        Future<String> future5 = service1.submit(cclass5);
//        Future<String> future6 = service1.submit(cclass6);
//        Future<String> future7 = service1.submit(cclass7);
//        Future<String> future8 = service1.submit(cclass8);
//        Future<String> future9 = service1.submit(cclass9);
//        Future<String> future10 = service1.submit(cclass10);
//
//
//        try {
//            System.out.println(future1.get());
//            System.out.println(future2.get());
//            System.out.println(future3.get());
//            System.out.println(future4.get());
//            System.out.println(future5.get());
//            System.out.println(future6.get());
//            System.out.println(future7.get());
//            System.out.println(future8.get());
//            System.out.println(future9.get());
//            System.out.println(future10.get());
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        service1.shutdown();

        System.out.println("**************************");

//Вывести в консоль текущую время и дату
//2. Выведите текущую дату в формате:
//26 ноября 2025
//3. Выведите текущую дату в формате 2025:11:2025T18:00:00
//4. Выведите текущую дату в формате год: 2025:11:2025 время: 18:00:00
        //System.out.println(LocalDateTime.now());
        LocalDateTime date = LocalDateTime.now();
        System.out.println(date.format(DateTimeFormatter.ofPattern("d MMMM yyy")));
        System.out.println(date.format(DateTimeFormatter.ofPattern("dd:MM:yyy'T'H:m:s")));
        System.out.println(date.format(DateTimeFormatter.ofPattern("'год: 'dd:MM:yyy' время 'HH:mm:ss")));

        //System.out.println(DateTimeFormatterBuilder.);

    }
}