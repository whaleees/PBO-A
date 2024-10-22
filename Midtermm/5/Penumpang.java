public class Penumpang {
    private String nama;
    private int umur;
    
    public Penumpang(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama(){
        return this.nama;
    }
    public int getUmur(){
        return this.umur;
    }
}
