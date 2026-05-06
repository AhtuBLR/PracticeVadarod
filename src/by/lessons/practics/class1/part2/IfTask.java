package by.lessons.practics.class1.part2;

import java.util.Scanner;

public class IfTask {
    /*Ввести числа a и b с консоли. Если a>b, то вывести разность (a-b) передав ее в новую переменную.
    Иначе если a=b  вывести сумму этих чисел.
    Иначе, вывести разность b-a. Результат вычисления передать в новую переменную.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите а");
        int a = sc.nextInt();
        System.out.println("Введите b");
        int b = sc.nextInt();
        System.out.println("Введите c");
        int c = sc.nextInt();


        if (a > b) {
            c = a - b;
            System.out.println("а > b, то выводим разность (a-b): " + c);
        } else if (a == b) {
            c = a + b;
            System.out.println(c);
        }
        else {
            c = b -a;
            System.out.println(c);
        }
    }
}
