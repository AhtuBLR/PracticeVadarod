package by.lessons.practics.class1.part1;

import java.util.Scanner;

public class Task2 {
    /*Введите x,y,z. К числу x прибавьте y, число y умножьте на z. Используйте операции присваивания.
  Результат выведите в косноль*/
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        System.out.println("Введите x");
    int x = sc.nextInt();
        System.out.println("Введите y");
    int y = sc.nextInt();
        System.out.println("Введите z");
    int z = sc.nextInt();
    int result =  x * (y*z);
        System.out.println("Результат выполненния задания: " + result);
}
}
