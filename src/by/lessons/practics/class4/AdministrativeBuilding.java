package by.lessons.practics.class4;
/*1.4 Создать класс Административном здание.
Административное здание должно наследоваться от Гражданского здания.
 Поля, которые можно определить в Административном здании:
 назначение административного здания (офисное, кинотеатр, спортсооружение),
 число людей, на которое рассчитано здание.*/

public class AdministrativeBuilding  extends CivilBuilding {
    private String adminPurpose; // офисное, кинотеатр, спортсооружение
    private int countOfpeople;

    public AdministrativeBuilding(String street, String matirialOfWall, int yearOfBuild, int floors, String purpose, String adminPurpose, int countOfpeople) {
        super(street, matirialOfWall, yearOfBuild, floors, purpose);
        this.adminPurpose = adminPurpose;
        this.countOfpeople = countOfpeople;
    }

    public int getNumberOfPeople () {
        return countOfpeople;
    }
    public int setNumberOfPeople(int newPeople){
        countOfpeople=newPeople;
        return countOfpeople;
    }
}
