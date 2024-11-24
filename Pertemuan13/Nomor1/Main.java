public class Main {
    public static void main(String[] args) {
        MakhlukHidup manusia = new Manusia();
        MakhlukHidup hewan = new Hewan();
        MakhlukHidup tumbuhan = new Tumbuhan();

        System.out.println("Manusia:");
        manusia.makan();
        manusia.bernafas();
        manusia.beraktivitas();

        System.out.println("\nHewan:");
        hewan.makan();
        hewan.bernafas();
        hewan.beraktivitas();

        System.out.println("\nTumbuhan:");
        tumbuhan.makan();
        tumbuhan.bernafas();
        tumbuhan.beraktivitas();
    }
}