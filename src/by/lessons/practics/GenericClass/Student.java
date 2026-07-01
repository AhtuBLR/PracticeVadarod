package by.lessons.practics.GenericClass;

public class Student {
    private int id;
    private String name;
    private String surname;
    private String faculty;

    public Student(int id, String name, String surname, String faculty) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
    }

    public String toString() {
        String result = "Student: id: " + id + ", " + "name: " + name + ", "
                + "surname: " + surname +  ", " + "faculty: " + faculty;
        return result;
    }
}
