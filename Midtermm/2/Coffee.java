public class Coffee {
    private String name;
    private int price;

    //Constructor
    public Coffee(String name, int price) {
        this.name = name;
        this.price = price;
    }

    //Setter
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(int price){
        this.price = price;
    }

    //Getter
    public String getName(){
        return this.name;
    }
    public int getPrice(){
        return this.price;
    }

    //Method
    public void displayCoffee() {
        System.out.println(name + " - " + price + " Rupiah");
    }
}