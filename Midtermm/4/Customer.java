import java.util.Scanner;

public class Customer {
    private BankAccount akunBank;
    
    public Customer(){
        akunBank = new BankAccount();
    }

    public void deposit(double amt){
        if (amt > 0) {
            akunBank.setSaldo(amt + akunBank.getSaldo());
            System.out.println("Successfully deposited: " + amt);
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    public void withdraw(double amt) {
        if (amt > 0) {
            if (akunBank.getSaldo() >= amt) {
                akunBank.setSaldo(akunBank.getSaldo() - amt);
                System.out.println("Successfully withdrew: " + amt);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    public double cekSaldo(){
        return akunBank.getSaldo();
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Customer customer = new Customer();

        while(true){
            System.out.println("Welcome to Bank");
            System.out.println("What can I help you?");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter Choices : ");
            int pilihan = s.nextInt();
            
            if(pilihan == 1){
                System.out.print("Enter amount to deposit : ");
                double amt = s.nextDouble();
                customer.deposit(amt);
            }else if(pilihan == 2){
                System.out.print("Enter amount to withdraw : ");
                double amt = s.nextDouble(); 
                customer.withdraw(amt);
            }else if(pilihan == 3){
                System.out.println("Your balance is : " + customer.cekSaldo());
            }else if(pilihan == 4){
                System.out.println("Thank you for using our bank");
                break;
            }else{
                System.out.println("Invalid choice");
            }
        }
        s.close();
    }
}
