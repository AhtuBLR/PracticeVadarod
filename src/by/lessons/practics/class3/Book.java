package by.lessons.practics.class3;

/*1 Создать класс Book c полями id (тип int),name (тип String), author (тип String),
   издательство ( тип String ), Год издания(тип Int), Количество страниц (тип int),
   цена (double).Инициализацию книги в классе main выполнять через конструктор с параметрами.
   Также определите конструктор без параметров.
    */
public class Book {
    int id;
    String name;
    String author;
    String publisher;
    int year;
    int qantity;
    double price;

    public Book(int id, String name, String author, String publisher, int year, int qantity, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.qantity = qantity;
        this.price = price;
    }

    public Book() {
        System.out.println("Конструктор без параметров");
    }



    // 2 Создать метод, который будет выводить информацию по полям которые есть в классе и назвать его info
    public void info() {

        System.out.println("ID: " + id);
        System.out.println("Название: " + name);
        System.out.println("Автор: " + author);
        System.out.println("Издательство: " + publisher);
        System.out.println("Год издания: " + year);
        System.out.println("Количество страниц: " + qantity);
        System.out.println("Цена: " + price);
        System.out.println("------------------------");
    }

    //3 Создать метод, который будет изменять цену книги (сам метод в качестве параметра будет принимать новую цену)
    public void changePrice(double newPrice) {
        this.price = newPrice;
    }

    // 5. Создать метод в классе Book, который будет принимать массив книг и возвращать массив книг, у которых год издания ниже переданнго года в методе.
    public static Book[] getBooksBeforeYear (Book[]books,int yearLimit){
        int count = 0;
        for (Book book : books) {
            if (book.year < yearLimit) {
                count++;
            }
        }

        Book[] result = new Book[count];
        int i = 0;
        for (Book book : books) {
            if (book.year < yearLimit) {
                result[i++] = book;
            }
        }
        return result;
    }
}
