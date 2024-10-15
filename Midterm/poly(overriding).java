// Superclass
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("The cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create an Animal object
        Animal myCat = new Cat();  // Create a Cat object

        myAnimal.sound();  // Calls the Animal version of sound()
        myCat.sound();     // Calls the Cat version of sound()
    }
}

/*
Enkapsulasi melindungi akses data dengan membuat field privat dan menyediakan akses menggunakan metode getter dan setter.
Abstraksi menyembunyikan detail implementasi melalui kelas abstrak dan metode abstrak.
Pewarisan memungkinkan kelas turunannya (Car) untuk mewarisi properti dan metode dari kelas induknya (Vehicle).
Polimorfisme memberikan fleksibilitas dalam menggunakan metode yang sama untuk berbagai tipe data atau objek.
*/