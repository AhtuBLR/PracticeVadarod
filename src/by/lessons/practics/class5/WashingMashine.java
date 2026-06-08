package by.lessons.practics.class5;

//5. Создать класс Стиральная машина.
// Поля наименование, бренд, стоимость, Boolean isOn.
// Класс стиральная машина имплементирует интерфейс Электроприборы.
// Переопределите метод ворк так, чтобы метод выводил «Стиральная машина стирает».
public class WashingMashine implements Electropribori, KitchenTecnika {
    private String name;
    private String brend;
    private double price;
    private boolean isOn;

    public WashingMashine (String name,String brend, double price, boolean isOn) {
        this.name = name;
        this.brend = brend;
        this.price = price;
        this.isOn = isOn;
    }


    @Override
    public void work() {
        System.out.println("Стиральная машина стирает");
    }

    @Override
    public void gotovit() {
        System.out.println("Стиралка сушит белье");
    }
}
