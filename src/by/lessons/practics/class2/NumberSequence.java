package by.lessons.practics.class2;

public class NumberSequence {
//    1. Необходимо, чтобы программа отображала следующую последовательность чисел:
//            7 14 21 28 35 42 49 56 63 70 77 84 91 98 (while)
    public static void main(String[] args) {
        int number = 7;
        while (number <= 98) {
            System.out.print(number + " ");
            number+=7;
        }
        System.out.println();
    }
}
