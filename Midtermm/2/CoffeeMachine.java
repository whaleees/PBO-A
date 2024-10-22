import java.util.ArrayList;

public class CoffeeMachine {
    Coffee[] menu;

    public CoffeeMachine() {
        menu = new Coffee[] {
            new Coffee("Kopi Hitam", 6000),
            new Coffee("Kopi Susu", 6000),
            new Coffee("Hot Americano", 6000),
            new Coffee("Hot Cappuccino", 10000),
            new Coffee("Piccolo Latte", 10000),
            new Coffee("Hot Cafe Latte", 10000),
            new Coffee("Hot Cafe Mocha", 10000),
            new Coffee("Hot Dark Chocolate", 10000),
            new Coffee("Hot Green Tea Latte", 10000),
            new Coffee("Hot Milk Chocolate", 10000)
        };
    }

    public void displayMenu() {
        System.out.println("Menu Coffee Machine:");
        for (int i = 0; i < menu.length; i++) {
            System.out.print((i + 1) + ". ");
            menu[i].displayCoffee();
        }
    }

    public void orderCoffee(int c) {
        if (c < 1 || c > menu.length) {
            System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
        } else {
            Coffee selectedCoffee = menu[c - 1];
            System.out.println("You order: " + selectedCoffee.name);
            System.out.println("Price: Rp" + selectedCoffee.price);
        }
    }
}