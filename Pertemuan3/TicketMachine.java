public class TicketMachine {
    private int price;
    private int balance;
    private int total;

    // Default Constructor with default values
    public TicketMachine(){
        this.price = 0;
        this.balance = 0;
        this.total = 0;
    }

    // Constructor with a parameter to set the ticket price
    public TicketMachine(int ticketCost){
        if(ticketCost > 0){
            this.price = ticketCost;
        }else{
            System.out.println("Invalid ticket price");
        }
        this.balance = 0;
        this.total = 0;
    }

    public void insertMoney(int amount){                        //setBalance 
        if(amount > 0){
            balance += amount;
        }else{
            System.out.println("Invalid amount");
        }
        System.out.println("You inserted : "+amount);
    }

    // Getter method to get ticket price
    public int getPrice(){
        return price;
    }

    // Getter method to get current balance
    public int getBalance(){
        return balance;
    }

    // Getter method to return the total amount of money collected by the machine
    public int getTotal(){
        return total;
    }

    public void printTicket(){
        // Check if the balance is sufficient to purchase the ticket
        if(balance >= price){
            // Print the ticket and update the total and balance
            System.out.println("--------------------------------------");  
            System.out.println("              Ticket ");
            System.out.println("--------------------------------------");  
            System.out.println("Ticket Price : " + price);
            System.out.println("Thank you for your purchase!!");
            System.out.println("--------------------------------------");  

            total += price;
            balance -= price;
        }else{
            // If not enough money, print an error message and the required amount
            System.out.println("Not enough money");
            System.out.println("You must insert at least " + (price - balance) + " more");
        }
    }
}
