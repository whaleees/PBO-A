public class Main {
    public static void main(String[] args) {
        // Create a new TicketMachine object with a ticket price of 5
        TicketMachine a = new TicketMachine(5);

        a.insertMoney(0);
        a.printTicket();
        System.out.println("Balance : " + a.getBalance());
    }
}