package by.lessons.practics.class6;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//Создай класс Book с полями:
//• String title
//• String author
public class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        Book book = (Book) o;
        if (title.equals(book.getTitle())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return author.hashCode() + title.hashCode();
    }

    @Override
    public String toString() {
        return "Книга: Автор - " + author + "; " + "Название - " + title;
    }
}


