package by.lessons.practics.class6;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class Main {

    public static void main(String[] args) {
//        1.1.Создать коллекцию List (реализация ArrayList). Типизация коллекции – String.
//        1.2Добавить  пару записей (Привет, Как дела, Праздник, Суфле)
//        1.3 Вывести все записи.

        List<String> list = new ArrayList<>();
        String st1 = "Привет!";
        String st2 = "Как дела?";
        String st3 = "Праздник";
        String st4 = "Суфле";

        list.add("Привет!");
        list.add("Как дела?");
        list.add("Праздник");
        list.add("Суфле");


        for (String st : list) {
            System.out.print(st + " ");
        }

        boolean candy = list.contains("Конфета");
        System.out.println();
        System.out.println("******************************");
        System.out.print(candy);


        // 1.5 Посчитать количество элементов в коллекции
        int size = list.size();
        System.out.println();
        System.out.println("******************************");
        System.out.println(size);


//  2. Условие: Создайте ArrayList<String> для хранения списка покупок.
// Добавь в него 5 товаров. Затем выведите весь список на экран,
// а после — удалите один товар по названию и снова выведите обновлённый список.
        List<String> arrayList1 = new ArrayList<>();

        String goods1 = "Мед";
        String goods2 = "Ручка";
        String goods3 = "Кресло";
        String goods4 = "Утюг";
        String goods5 = "Фен";

        arrayList1.add(goods1);
        arrayList1.add(goods2);
        arrayList1.add(goods3);
        arrayList1.add(goods4);
        arrayList1.add(goods5);

        for (String arrayList : arrayList1) {

            System.out.print(arrayList+ " ");

        }

        System.out.println();
        System.out.println("******************************");
        arrayList1.remove("Утюг");
        System.out.print(arrayList1.toString());


//3.1. Создайте 3 книги. И добавьте эти книги в коллекцию. Используйте метод List.of();

        List<Book> books = new ArrayList<>();

        Book book1 = new Book("Война и мир", "Толстой");
        Book book2 = new Book("Идиот", "Достоевский");
        Book book3 = new Book("Гамлет", "Шекспир");

        books.add(book1);
        books.add(book2);
        books.add(book3);

        System.out.println();
        System.out.println("******************************");

        for (Book book : books) {
            System.out.println(book.toString());
        }

        System.out.println();
        books.remove(book2);
        System.out.println("Книги после удаления: " + books);


        Set<Book> books2 = new HashSet<>();
        books2.add(book1);
        books2.add(book2);
        books2.add(book3);

        System.out.println("******************************");
        System.out.println("Книги коллекции Set: " );
        for (Book b: books2){
            System.out.println(b);
        }
    }
}