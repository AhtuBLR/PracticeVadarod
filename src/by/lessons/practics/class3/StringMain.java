package by.lessons.practics.class3;
//1. Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
public class StringMain {
    public static void main(String[] args) {
        String str = "I like Java";



        //2. Распечатать последний символ строки. Используем метод String.charAt().
        String str2 = "Какая-то строка";
              char a =   str2.charAt(str2.length()-1);
        System.out.println(a);

        //10. Вырезать строку Java c помощью метода String.substring().
        String str3 = "I like Java";
        String b = str3.substring(7,11);
        System.out.println(b);
    }
}