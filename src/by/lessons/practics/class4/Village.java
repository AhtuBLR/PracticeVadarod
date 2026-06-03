package by.lessons.practics.class4;


/*1. Класс Деревня. Деревня будет состоять из построек.
К постройкам относятся промышленные здания и гражданские.
К промышленным зданиям будут относится заводы и фермы.
К гражданским будут относится: административные здания, жилые здания.*/


public class Village {

    public Building arrBuild[] = new Building[5];


    public Village(Building[] arrBuild) {
        this.arrBuild = arrBuild;
    }
}
