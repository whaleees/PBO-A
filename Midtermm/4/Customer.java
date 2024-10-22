import java.util.Scanner;

public class Customer {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BankAccount akunBank = new BankAccount();
        while(true){
            System.out.println("Welcome to Bank");
            System.out.println("What can I help you?");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choice : ");
            int pilihan = s.nextInt();
            
            if(pilihan == 1){
                System.out.print("Enter amount to deposit : ");
                double deposit = s.nextDouble();
                akunBank.depositSaldo(deposit);
            }else if(pilihan == 2){
                System.out.print("Enter amount to withdraw : ");
                double withdraw = s.nextDouble(); 
                akunBank.withdrawSaldo(withdraw);
            }else if(pilihan == 3){
                System.out.println("Your balance is : " + akunBank.cekSaldo());
            }else if(pilihan == 4){
                System.out.println("Thank you for using our bank");
                break;
            }
        }
        s.close();
    }
}
