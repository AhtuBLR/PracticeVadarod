package by.lessons.practics.GenericClass;
//дженерики нужны,чтобы мы могли работать с любыми типами данных
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(1,"Аркадий","Блинов" );
        Information <Employee, String> employeeInfo= new Information<>(employee, "Директор");
        System.out.println(employeeInfo.toString());

        Student student = new Student(2, "Семен", "Семенов", "строительный");
        Information<Student, Integer> studentInfo = new Information<>(student, 7);
        System.out.println(studentInfo.toString());}
}
