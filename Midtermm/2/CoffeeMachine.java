import java.util.ArrayList;

public class CoffeeMachine {
    private ArrayList<Coffee> menu;
    private ArrayList<String> orderHistory;

    public CoffeeMachine() {
        menu = new ArrayList<>();
        orderHistory = new ArrayList<>();
        menu.add(new Coffee("Kopi Hitam", 6000));
        menu.add(new Coffee("Kopi Susu", 6000));
        menu.add(new Coffee("Hot Americano", 6000));
        menu.add(new Coffee("Hot Cappuccino", 10000));
        menu.add(new Coffee("Piccolo Latte", 10000));
        menu.add(new Coffee("Hot Cafe Latte", 10000));
        menu.add(new Coffee("Hot Cafe Mocha", 10000));
        menu.add(new Coffee("Hot Dark Chocolate", 10000));
        menu.add(new Coffee("Hot Green Tea Latte", 10000));
        menu.add(new Coffee("Hot Milk Chocolate", 10000));
    }

    public void displayMenu() {
        System.out.println("\nMenu Coffee Machine:");
        for (int i = 0; i < menu.size(); i++) {
            System.out.print((i + 1) + ". ");
            menu.get(i).displayCoffee();
        }
    }

    public void orderCoffee(int c) {
        if (c < 1 || c > menu.size()) {
            System.out.println("Invalid Choice.");
        } else {
            Coffee selected = menu.get(c - 1);
            System.out.println("You Ordered " + selected.getName() + " - " + selected.getPrice() + " Rupiah");
            orderHistory.add(selected.getName() + " - " + selected.getPrice() + " Rupiah");
        }
    }

    public void displayOrderHistory() {
        System.out.println("Order History:");
        if (orderHistory.isEmpty()) {
            System.out.println("No orders yet.\n");
        } else {
            for (int i = 0; i < orderHistory.size(); i++) {
                System.out.println((i + 1) + ". " + orderHistory.get(i));
            }
            System.out.println("");
        }
    }
}