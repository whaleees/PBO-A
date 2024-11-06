import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        System.out.println("Welcome to Lala's CoffeeMachine");

        while(true){
            System.out.println("1. Choose Coffee");
            System.out.println("2. View Order History");
            System.out.println("3. Exit");
            System.out.print("Enter Choices : ");
            int choice =  s.nextInt();
            
            if(choice == 1){
                coffeeMachine.displayMenu();
                System.out.print("Choose Coffee : ");
                int pilihan = s.nextInt();
                coffeeMachine.orderCoffee(pilihan);
            }else if(choice == 2){
                coffeeMachine.displayOrderHistory();
            }else if(choice == 3){
                System.out.println("\nThank you for coming!!");
                break;
            }else{
                System.out.println("\nInvalid choice");
            }
        }
        
        s.close();
    }
}