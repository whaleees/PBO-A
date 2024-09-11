// Inheritance: Class SportsCar yang mewarisi class Car
class SportsCar extends Car {
    private int horsepower;

    public SportsCar(String brand, String model, int year, int horsepower) {
        super(brand, model, year);  // Memanggil constructor dari superclass
        this.horsepower = horsepower;
    }

    // Polymorphism: Implementasi method dari class 
    public void startEngine() {
        System.out.println("Starting the engine of the sports car: " + getBrand() + " " + getModel());
    }

    public void stopEngine() {
        System.out.println("Stopping the engine of the sports car: " + getBrand() + " " + getModel());
    }

    // Overloading: Method yang overload berdasarkan jumlah dan tipe parameter
    public void accelerate() {
        System.out.println("The sports car is accelerating!");
    }

    public void accelerate(int speed) {
        System.out.println("The sports car is accelerating to " + speed + " km/h!");
    }

    // Encapsulation: Menggunakan get untuk mengakses atribut private
    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
}