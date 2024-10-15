class Person {
    // Private fields
    private String name;
    private int age;

    // Public constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public getter method for name
    public String getName() {
        return name;
    }

    // Public setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method for age
    public int getAge() {
        return age;
    }

    // Public setter method for age
    public void setAge(int age) {
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", 25);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Modify the person's age using the setter
        person.setAge(30);
        System.out.println("Updated Age: " + person.getAge());
    }
}

/*
Enkapsulasi melindungi akses data dengan membuat field privat dan menyediakan akses menggunakan metode getter dan setter.
Abstraksi menyembunyikan detail implementasi melalui kelas abstrak dan metode abstrak.
Pewarisan memungkinkan kelas turunannya (Car) untuk mewarisi properti dan metode dari kelas induknya (Vehicle).
Polimorfisme memberikan fleksibilitas dalam menggunakan metode yang sama untuk berbagai tipe data atau objek.
*/