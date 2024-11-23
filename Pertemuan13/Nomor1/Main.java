public class Main {
    public static void main(String[] args) {
        Manusia manusia = new Manusia();
        Hewan hewan = new Hewan();
        Tumbuhan tumbuhan = new Tumbuhan();

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