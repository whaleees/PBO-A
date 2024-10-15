class MathOperations {
    // Method overloading: same method name but different parameters
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println("Integer addition: " + math.add(2, 3));
        System.out.println("Double addition: " + math.add(2.5, 3.5));
    }
}

/*
Enkapsulasi melindungi akses data dengan membuat field privat dan menyediakan akses menggunakan metode getter dan setter.
Abstraksi menyembunyikan detail implementasi melalui kelas abstrak dan metode abstrak.
Pewarisan memungkinkan kelas turunannya (Car) untuk mewarisi properti dan metode dari kelas induknya (Vehicle).
Polimorfisme memberikan fleksibilitas dalam menggunakan metode yang sama untuk berbagai tipe data atau objek.
*/