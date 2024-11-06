public class Main {
    public static void main(String[] args) {
        Human kresna = new Human("Kresna", 19);
        kresna.setName("Budi");
        kresna.setAge(100);

        System.out.println(kresna.getName());
        System.out.println(kresna.getAge());
        kresna.greetings();
    }    
}
