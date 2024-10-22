public class Human {
    private String name;
    private int age;

    //Constructor
    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Fungsi Setter
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    //Fungsi Getter
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    public void greetings(){
        System.out.println("Halo nama saya " + name + ", saya umur " + age);
    }
}
