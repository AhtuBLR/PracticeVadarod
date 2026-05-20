package by.lessons.practics.class2;

public class Array {
    public static void main(String[] args) {//    Создать массив чисел от 1 до 100. Вывести полученный массив.
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
