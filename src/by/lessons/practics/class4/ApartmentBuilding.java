package by.lessons.practics.class4;

/*1.5 Создать класс Многоквартирный жилой дом. Вопрос: От какого класса должен наследоваться Многоквартирный жилой дом.
Поля, которые можно определить в Многоквартирном жилье: количество квартир.*/

public class ApartmentBuilding extends CivilBuilding {
    private int apartmentCount;

    public ApartmentBuilding(String street, String matirialOfWall, int yearOfBuild, int floors, String purpose, int apartmentCount) {
        super(street, matirialOfWall, yearOfBuild, floors, purpose);
        this.apartmentCount = apartmentCount;
    }
}
