package by.lessons.practics.class1.part2;

import java.util.Scanner;

public class IfTask2 {
    //На вход дано число. Определить, делиться ли оно на три. Вывести соответствующий текст.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите а");
        int a = sc.nextInt();

        if (a%3 ==0){
            System.out.println("Число делится на 3");
        }
        else System.out.println("Число а не делится на 3");
    }
}
