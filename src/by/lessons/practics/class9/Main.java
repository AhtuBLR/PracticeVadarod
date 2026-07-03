package by.lessons.practics.class9;

//Задание №2
//        1. Создать класс авто. Поля: id, марка, пробег, год выпуска, максимальная скорость, цена.
//1.1 Создать коллекцию из авто.
//        1.2 Найти самую быструю машину.
//        1.3 Найти самую медленную машину.
//        1.4 Найти самую старую
//1.5 Найти самую новую
//1.6 Найти машины, у которых пробег от 50000 до 100000.
//        1.7 Найти самую дорогую машину.
//        1.8 Найти самую дешёвую машину.
//        1.9 Отсортировать машины по пробегу (по возрастанию и по убыванию
//        1.10 Отсортировать машины по стоимости (по возрастанию и по убыванию)
//1.11 Найти машины в диапазоне пробега от 20000 до 100000 и в диапазоне цен от 10000 до 20000.
//        1.12 Получить не повторяющиеся значения марок авто (distinct).
//        1.13 Найти машину в задданом дипазоне цен, определённой марки, с заданным дипазоном пробега, в заданном диапазон год выпуска. Если таких нет, выбросить своё исключение.

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Multiplication multiplication1 = ((a, b) -> {
            System.out.println("Привет, умножаем!");
            return a * b;
        });
        System.out.println(multiplication1.multiplication(5, 10));

        Multiplication multiplication2 = ((a, b) -> {
            System.out.println("Привет, делим!");
            return a / b;
        });
        System.out.println(multiplication2.multiplication(10, 2));
        stream1();

    }

    public static void stream1() {
        Car car1 = new Car(1, "Peugeot", 112000, 2018, 215, 10000);
        Car car2 = new Car(1, "BMW", 134000, 2012, 200, 10000);
        Car car3 = new Car(1, "Ford", 18000, 2015, 200, 10000);
        Car car4 = new Car(1, "Audi", 210000, 2009, 220, 15000);
        Car car5 = new Car(1, "Tesla", 19000, 2025, 245, 100000);

        List<Car> cars = List.of(car1, car2, car3, car4, car5);



//1.6 Найти машины, у которых пробег от 50000 до 100000.

        List<Car> list = cars.stream().filter(car -> {
            if (car.getProbeg() > 50000 && car.getProbeg() <= 100000) {
                return true;
            } else return false;
        }).toList();
        List<Car> list1 = cars.stream().filter(car -> car.getProbeg() > 50000 && car.getProbeg() <= 100000).toList();
        System.out.println(list);
    }
}
