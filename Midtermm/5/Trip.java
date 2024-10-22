import java.util.ArrayList;

public class Trip {
    private String destination;
    private int distance;
    private double costPerKm;
    ArrayList<Penumpang> listPenumpang = new ArrayList<>();
    
    //Constructor
    public Trip(String destination, int distance, double costPerKm){
        this.destination = destination;
        this.distance = distance;
        this.costPerKm = costPerKm;
    }

    //Fungsi Setter untuk mengubah attribute
    public void setDestination(String destination){
        this.destination = destination;
    }
    public void setDistance(int distance){
        this.distance = distance;
    }
    public void setCostPerKm(double costPerKm){
        this.costPerKm = costPerKm;
    }

    //Fungsi Getter untuk mendapatkan attribute
    public String getDestination(){
        return this.destination;
    }
    public int getDistance(){
        return this.distance;
    }
    public double getCostPerKm(){
        return this.costPerKm;
    }

    //Fungsi untuk menghitung total biaya perjalanan berdasarkan jarak dan biaya per kilometer
    public double hitungTotalBiaya(){
        return this.distance * this.costPerKm;
    }

    //Fungsi untuk menambah penumpang 
    public void tambahPenumpang(Penumpang penumpang){
        this.listPenumpang.add(penumpang);
    }

    //Fungsi untuk mencetak daftar penumpang
    public void cetakDaftarPenumpang(){
        for(int i = 0; i < listPenumpang.size(); i++){
            System.out.println("Nama Penumpang : " + listPenumpang.get(i).getNama());
            System.out.println("Umur Penumpang : " + listPenumpang.get(i).getUmur());
            System.out.println();
        }
    }

    //Fungsi untuk membatalkan perjalanan jika penumpang kurang dari jumlah minimum
    public int jumlahPenumpang(){
        return this.listPenumpang.size();
    }

    public void batalkanPerjalanan(){
        System.out.println("Perjalanan dibatalkan karena jumlah penumpang kurang dari yang ditentukan");
    }
}
