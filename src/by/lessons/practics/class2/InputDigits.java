package by.lessons.practics.class2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class InputDigits {
    public static void main(String[] args) {
//        Ввести число с консоли, которое не заканчивается на 0.
//        Вывести макс и мин цифру в числе. Использовать оператор %. (while)
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите х");
        int x = sc.nextInt();
        int min=100;
        int max=0;
        int vr;
        if(x % 10 ==0 ) {
            System.out.println("Число х не соответсвует условию задания");
        }else {
            while (x>0){
                vr = x%10;
                if (min>vr) {
                    min = vr;
                }
                if(max < vr) {
                    max = vr;

                }
                x= x/10;
            }
            System.out.println("Минимальное число: " +min);
            System.out.println("Максимальное число: " + max);

        }
    }
}
