package by.lessons.practics.GenericClass;

public class Employee {
    private int id;
    private String name;
    private String surname;

    public Employee(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public String toString() {
        String result = "Employee: id: " + id + ", " + "name: " + name + ", " + "surname: " + surname;
        return result;
    }
}
