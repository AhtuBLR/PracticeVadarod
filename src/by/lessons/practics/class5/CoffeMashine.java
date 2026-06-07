package by.lessons.practics.class5;

//3. Создать класс Кофемашина. Поля наименование.
// Список функционала. Стоимость, Boolean isOn (включен)
// Класс кофемашина имплементирует интерфейс Электроприборы.
// Переопределите метод ворк так, чтобы методы выводил «Кофемашина варит кофе».
public class CoffeMashine implements Electropribori {
    private String name;
    private String functions;
    private double price;
    private Boolean isOn;

    public CoffeMashine(String name, String functions, double price, Boolean isOn) {
        this.name = name;
        this.functions = functions;
        this.price = price;
        this.isOn = isOn;

    }

    @Override
    public void work() {
        System.out.println("Кофемашина варит кофе");
    }

    /*void switchOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Кофемашина выключена");
        } else {
            System.out.println("Кофемашина уже выключена");
        }
    }*/

    public void switchOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Кофемашина выключена");
            return;//завершает метод
        }
        System.out.println("Кофемашина уже выключена");
    }
}


