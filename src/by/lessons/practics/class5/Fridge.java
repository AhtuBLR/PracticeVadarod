package by.lessons.practics.class5;

//4. Создать класс Холодильник. Поля: наименование, марка, стоимость, Boolean isOn (включен).
// Класс холодильник имплементирует интерфейс Электроприборы.
// Переопределите метод work так, чтобы методы выводил «Холодильник морозит».
public class Fridge implements  KitchenTecnika {
    private String name;
    private String marka;
    private double price;
    private Boolean isOn;


    public Fridge(String name, String marka, double price, Boolean isOn) {
        this.name = name;
        this.marka = marka;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void work() {
        System.out.println("Холодильник морозит");
    }

    @Override
    public void gotovit() {
        System.out.println("Холодильник готовит лед");
    }
}
