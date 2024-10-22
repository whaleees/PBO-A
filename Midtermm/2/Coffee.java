public class Coffee {
    String name;
    int price;

    public Coffee(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void displayCoffee() {
        System.out.println(name + " - RP " + price);
    }
}