package by.lessons.practics.class9;

//1. Создать класс авто. Поля: id, марка, пробег, год выпуска, максимальная скорость, цена.
public class Car {
    private int id;
    private String brand;
    private int probeg;
    private int dateIssue;
    private int maxSpeed;
    private int price;

    public Car(int id, String brand, int probeg, int dateIssue, int maxSpeed, int price) {
        this.id = id;
        this.brand = brand;
        this.probeg = probeg;
        this.dateIssue = dateIssue;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return brand;
    }

    public int getProbeg() {
        return probeg;
    }

    public int getDateIssue() {
        return dateIssue;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.brand = model;
    }

    public void setProbeg(int probeg) {
        this.probeg = probeg;
    }

    public void setDateIssue(int dateIssue) {
        this.dateIssue = dateIssue;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + brand + '\'' +
                ", probeg=" + probeg +
                ", dateIssue=" + dateIssue +
                ", maxSpeed=" + maxSpeed +
                ", price=" + price +
                '}';
    }
}