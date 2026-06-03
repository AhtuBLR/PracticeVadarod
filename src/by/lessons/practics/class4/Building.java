package by.lessons.practics.class4;

//1.1 Создать класс Постройка (Building). Поля у класса Постройка: улица, материал стен, год постройки.

public class Building {

    private String street;
    private String matirialOfWall;
    private int yearOfBuild;

    public Building(String street, String matirialOfWall, int yearOfBuild) {
        this.street = street;
        this.matirialOfWall = matirialOfWall;
        this.yearOfBuild = yearOfBuild;
    }
}