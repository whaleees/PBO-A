public class Main {
    public static void main(String[] args) {
        TicketMachine a = new TicketMachine(100);

        a.insertMoney(1000);
        System.out.println("Current Balance : " + a.getBalance());
        System.out.println("The ticket price : " + a.getPrice());
        
        a.printTicket();
        a.insertMoney(1000);
        System.out.println("Current Balance : " + a.getBalance());
    }
}