
public class Hewan extends MakhlukHidup {
    @Override
    public void makan() {
        System.out.println("Hewan makan dengan mulut atau paruh.");
    }
    @Override
    public void bernafas() {
        System.out.println("Hewan bernafas menggunakan paru-paru, insang, atau kulit.");
    }
    @Override
    public void beraktivitas() {
        System.out.println("Hewan beraktivitas dengan berburu, mencari makan, atau berlindung.");
    }
}