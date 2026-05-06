package by.lessons.practics.class1.part1;

public class Task4 {
    //1 Даны значения: x=5; y=2; c=x*y;
    // Расставьте операции инкремента декремента так, чтобы после выполнения операции (c=x*y) с=10; x=6; y=1
    public static void main(String[] args) {
int x = 5, y = 2, c;
c = x++ *y--;
        System.out.println("Результат выполнения с = " + c);
        System.out.println("Результат выполнения x = " + x);
        System.out.println("Результат выполнения x = " + y);
    }
}
