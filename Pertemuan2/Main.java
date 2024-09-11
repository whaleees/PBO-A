public class Main {
    public static void main(String[] args) {
        // Object: Membuat objek dari class SportsCar dan ElectricCar
        SportsCar ferrari = new SportsCar("Ferrari", "488 Spider", 2020, 670);

        // Polymorphism: Memanggil method yang di-override dari class 
        ferrari.startEngine();
        ferrari.accelerate();
        ferrari.accelerate(200);
        ferrari.stopEngine();
    }
}