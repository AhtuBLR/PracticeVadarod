package by.lessons.practics.class4;


/*2.1  Создать спортсооружение, исполком, 2 жилых дома,
2 фабрики Значения придумать самим. Добавить эти объекты в деревню
(реализовать метод по добавлению постройки в деревню)
(должны придумать,как это сделать)*/
public class Main {
    public static void main(String[] args) {
        //2.1  Создать спортсооружение
        AdministrativeBuilding sportBuilding = new AdministrativeBuilding("Красная", "блок", 1949,
                10, "общественное", "2", 150);

        //2.2 Получить значение количества людей, которые могут находится в
        // спортсооружении, созданном выше и вывести это в консоль (метод getter)
        int result = sportBuilding.getNumberOfPeople();

        System.out.println(result);

        //2.3 Изменить количество людей, которые могут находится в
        // спортсооружении и вывести их в консоль после изменения (методы setter и getter)
        sportBuilding.setNumberOfPeople(232);
        System.out.println(sportBuilding.getNumberOfPeople());

        Factory factoryBuild = new Factory("Правды", "блок",
                1985, "аграраная", 112);

        Building building[] = new Building[2];
        building[0] = sportBuilding;
        building[1] = factoryBuild;

        Village village = new Village(building);
    }
}
