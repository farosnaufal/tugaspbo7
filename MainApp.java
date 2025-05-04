package main;

public class MainApp {
    public static void main(String[] args) {
        // Membuat objek Person dan Student
        Person person = new Person("John Doe");
        Student student = new Student("Jane Doe", "S12345");

        // Memperkenalkan objek
        person.introduce();
        student.introduce();
    }
}
