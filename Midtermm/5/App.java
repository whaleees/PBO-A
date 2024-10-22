import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Trip trip = new Trip("Surabaya", 100, 10);

        System.out.println("Trip dengan tujuan ke " + trip.getDestination());
        System.out.println("Jarak : " + trip.getDistance());
        System.out.println("Cost per KM : " + trip.getCostPerKm());     
        
        //Fitur A
        System.out.println("Total Cost : " + trip.hitungTotalBiaya());
        
        //Fitur B
        Penumpang a = new Penumpang("kresna", 15);
        Penumpang b = new Penumpang("budi", 20);
        trip.tambahPenumpang(a);
        trip.tambahPenumpang(b);
        trip.cetakDaftarPenumpang();

        //Fitur C
        int minimumJumlahPenumpang = 3;
        if(trip.jumlahPenumpang() < minimumJumlahPenumpang){
            trip.batalkanPerjalanan();
        }
    }
}
