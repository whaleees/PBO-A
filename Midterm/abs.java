// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void sound();

    // Regular method
    public void sleep() {
        System.out.println("This animal is sleeping");
    }
}

// Subclass (inheriting from Animal)
class Dog extends Animal {
    // Provide implementation of the abstract method
    public void sound() {
        System.out.println("The dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();  // Create a Dog object
        myDog.sound();  // Call the abstract method
        myDog.sleep();  // Call the regular method
    }
}

/*
Enkapsulasi melindungi akses data dengan membuat field privat dan menyediakan akses menggunakan metode getter dan setter.
Abstraksi menyembunyikan detail implementasi melalui kelas abstrak dan metode abstrak.
Pewarisan memungkinkan kelas turunannya (Car) untuk mewarisi properti dan metode dari kelas induknya (Vehicle).
Polimorfisme memberikan fleksibilitas dalam menggunakan metode yang sama untuk berbagai tipe data atau objek.
*/