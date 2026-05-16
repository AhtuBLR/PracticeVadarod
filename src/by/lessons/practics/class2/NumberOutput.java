package by.lessons.practics.class2;

public class NumberOutput {
    public static void main(String[] args) {
        // 3.1: Вывести числа от 100 до 1 через запятую
        System.out.print("Числа от 100 до 1: ");
        for (int i = 100; i >= 1; i--) {
            System.out.print(i);
            if (i > 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("---------------------------");

        // 3.2: Вывести каждый десяток от 1 до 100
        System.out.print("Каждый десяток от 1 до 100: ");
        for (int i = 10; i <= 100; i += 10) {
            System.out.print(i);
            if (i < 100) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

