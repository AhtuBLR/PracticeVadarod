package by.lessons.practics.class2;

public class SumOfFirstTenNumbers {
    public static void main(String[] args) {
//        2. Написать программу, которая посчитает сумму первых 10 чисел (while)
        int sum = 0;
        int count = 1;

        while (count <= 10) {
            sum += count;
            count++;
        }

        System.out.println("Сумма первых 10 чисел равна: " + sum); // Вывод результата
    }
}
