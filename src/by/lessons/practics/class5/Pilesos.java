package by.lessons.practics.class5;

//6. Создать класс Пылесос.
// Поля наименование, бренд, стоимость, Boolean isOn.
// Класс Пылесос имплементирует интерфейс Электроприборы.
// Переопределите метод ворк так, чтобы метод выводил «Пылесос убирает».
public class Pilesos implements Electropribori {
    private String name;
    private String brend;
    private double price;
    private boolean isOn;

    public Pilesos(String name, String brend, double price, boolean isOn) {
        this.name = name;
        this.brend = brend;
        this.price = price;
        this.isOn = isOn;
    }


    @Override
    public void work() {
        System.out.println("Пылесос убирает");
    }

    public void pilesosit (){
        System.out.println("Пылесос пылессосит");
    }
}
