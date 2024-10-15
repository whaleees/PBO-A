// Superclass
class Vehicle {
    protected String brand = "Ford";  // Vehicle attribute

    public void honk() {  // Vehicle method
        System.out.println("Tuut, tuut!");
    }
}

// Subclass (inherits from Vehicle)
class Car extends Vehicle {
    private String modelName = "Mustang";  // Car attribute

    public String getModel() {
        return modelName;
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();  // Call the inherited method from Vehicle
        System.out.println("Brand: " + myCar.brand + ", Model: " + myCar.getModel());
    }
}

/*
Enkapsulasi melindungi akses data dengan membuat field privat dan menyediakan akses menggunakan metode getter dan setter.
Abstraksi menyembunyikan detail implementasi melalui kelas abstrak dan metode abstrak.
Pewarisan memungkinkan kelas turunannya (Car) untuk mewarisi properti dan metode dari kelas induknya (Vehicle).
Polimorfisme memberikan fleksibilitas dalam menggunakan metode yang sama untuk berbagai tipe data atau objek.
*/