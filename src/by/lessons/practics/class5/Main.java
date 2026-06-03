package by.lessons.practics.class5;

//В классе main cоздайте по паре объектов на основании вышесозданных классов.
// Создайте в классе main создайте выставку из электроприбров и продемонстрируйте
// способности каждого электроприбора
public class Main {
    public static void main(String[] args) {
        CoffeMashine coffeMashine1 = new CoffeMashine("LG", "кофеварка", 1236.36, true);
        CoffeMashine coffeMashine2 = new CoffeMashine("Delonghi", "латте", 1425.36, false);

        Fridge fridge1 = new Fridge("Lg", "T2154", 1785.25, true);

        WashingMashine washingMashine1 = new WashingMashine("Samsung", "R2356", 1525.15, false);

        Pilesos pilesos1 = new Pilesos("Tomas", "V500", 2568.13, false);

        Electropribori[] electropriboris = {coffeMashine1, coffeMashine2, fridge1, washingMashine1, pilesos1};


        for (Electropribori el : electropriboris) {
            el.work();
        }

        // 9.  В классе main сделать выставку только из Кухонной техники.
        // Продемонстрировать спосбоности всех электроприборов в этой выставке.
        KitchenTecnika[] kitchenTecnikas = {fridge1, washingMashine1};

        for (KitchenTecnika kT : kitchenTecnikas) {
            kT.work();
        }
    }
}