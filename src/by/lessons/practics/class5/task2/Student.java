package by.lessons.practics.class5.task2;
//2. Создать класс Студент. Поля факультет

public class Student extends Person {
    private String faculty;

    public Student(String firstName, String lastName, String faculty) {
        super(firstName, lastName);
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
