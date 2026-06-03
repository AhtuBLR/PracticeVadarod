package by.lessons.practics.class4;
/*1.3 Создать класс Промышленном здание (IndustrialBuilding).
Промышленные здания наследуются от Постройки.
Поля которые можно определить в Промышленном здании:
отрасль (Отрасль в которой здание задействовано (машиностроительная, легкая промышленность,
целлюлозная промышленность, сельское хозяйство)*/

public class IndustrialBuilding extends Building {
    private String industry; // отрасль;машиностроительная, легкая промышленность, целлюлозная промышленность, сельское хозяйство

    public IndustrialBuilding(String street, String matirialOfWall, int yearOfBuild, String industry) {
        super(street, matirialOfWall, yearOfBuild);
        this.industry = industry;
    }
}
