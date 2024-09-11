class Car {
    // Encapsulation: Penggunaan private dan protected untuk membatasi akses langsung
    private String brand;
    private String model;
    private int year;

    // Constructor untuk menginisialisasi atribut
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Getter dan Setter: Bagian dari encapsulation
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}