package by.lessons.practics.class1.part2;

import java.util.Scanner;

public class IfTask3 {
    /*На вход дано число. Определить, делиться ли оно на 3 и на 7,
    если нет, тогда проверить делиться ли оно на 3, если не делиться,
    то проверить, делиться ли оно на 7. Вывести соответствующий текст.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите а");
        int a = sc.nextInt();

        if (a % 3 == 0 && a % 7 == 0) {
            System.out.println("Число делится на 3  и на 7");
        } else if (a % 3 == 0) {
            System.out.println("Число а не делится на 3");
        } else if (a % 7 == 0) {
            System.out.println("Число а не делится на 7");
        } else System.out.println("Не делится");
    }
}
