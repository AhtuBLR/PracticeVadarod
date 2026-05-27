package by.lessons.practics.class4;


//1.2 Создать класс Гражданские здания (CivilBuilding). Гражданские здания должны наследоваться от класса Постройка. Поля у класса Гражданские здания: назначение (жилье или общественные здания), количество этажей.

public class CivilBuilding extends Building {
    private String purpose; // жилье или общественные здания
    private int floors; // количество этажей


    public CivilBuilding(String street, String matirialOfWall, int yearOfBuild, int floors, String purpose) {
        super(street, matirialOfWall, yearOfBuild);
        this.floors = floors;
        this.purpose = purpose;
    }
}
