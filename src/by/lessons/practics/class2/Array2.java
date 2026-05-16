package by.lessons.practics.class2;

public class Array2 {
    public static void main(String[] args) {
//        Создать массив из чисел. Вывести макс и мин число.
        int[] numbers = {12, 62, 23, 52, 98, 13, 8};

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // Обновляем max, если текущее число больше
            }
            if (numbers[i] < min) {
                min = numbers[i]; // Обновляем min, если текущее число меньше
            }
        }


        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);
    }
    }
